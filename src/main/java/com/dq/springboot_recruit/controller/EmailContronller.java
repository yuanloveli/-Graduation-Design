package com.dq.springboot_recruit.controller;

import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dq.springboot_recruit.util.SendMailUtil;;

@Controller
@RequestMapping("/email")
public class EmailContronller {

	@Autowired
	private SendMailUtil SendMailUtil;
	
	@RequestMapping(value = "/code", method=RequestMethod.POST)
	@ResponseBody
	public int sendCode(String receiveEmail, String nickname, HttpSession session) {
		String code="";
		Random rd= new Random();

		//生成验证码
		while(code.length() < 6) {
			code += rd.nextInt(10);
		}
		
		System.out.println("邮件中的验证码为：" + code +"-邮箱："+ receiveEmail +"-昵称："+ nickname);
		System.out.println("正在发送邮件...");

		if(SendMailUtil.sendHtmlMail(receiveEmail, nickname, code)){
			session.setAttribute("vcode", code);
			System.out.println("邮件发送成功...");

			TimerTask task = new TimerTask() {
				public void run() {
					session.removeAttribute("vcode");
				}
			};
			Timer timer = new Timer();
			timer.schedule(task, 180000); //3分钟之后执行task任务一次
			return 1;
		}
		System.out.println("邮件发送失败...");
		return 0;
	}
	

	@RequestMapping("/check")
	@ResponseBody
	public int checkInfo(@RequestParam Map<String, String> map, HttpSession session) {
		//获取发送的验证码
		System.out.println("正在检查邮箱验证码是否正确...");
		if(session.getAttribute("vcode") == null) { //说明验证码过期
			System.out.println("验证码过期...");
			return -2;
		}
		String str = session.getAttribute("vcode").toString();
		System.out.println("前端页面输入的验证码为："+map.get("code"));

		
		if(!String.valueOf(str).equals(map.get("code"))) { //说明输入的验证不正确
			System.out.println("验证码错误...");
			session.removeAttribute("vcode");
			return -1;
		}
		session.removeAttribute("vcode");
		return 1;
	}
	
}
