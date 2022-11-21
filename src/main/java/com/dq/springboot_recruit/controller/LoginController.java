package com.dq.springboot_recruit.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.service.ILoginService;
import com.dq.springboot_recruit.util.ResponseUtil;
import com.dq.springboot_recruit.websocket.WebServerSocket;


/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月9日 下午4:08:21
*/
@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private ILoginService loginService;
	
	//求职者登录
	@RequestMapping(value = "/joberLogin", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> joberLogin(JoberInfo joberInfo, HttpSession session) {
		System.out.println("求职者登录中...");
		System.out.println("前端传过来的数据：" + joberInfo);
		JoberInfo jober = loginService.joberLogin(joberInfo);
		
		System.out.println("登录查询的结果：" + jober);
		if (jober == null) {
			//账号或密码错误
			System.out.println("求职者账号或密码错误...");
			return ResponseUtil.responseMap(500, null, null);
		}
		
		session.setAttribute("currentLoginjober", jober);
		//判断这个账号有没有在其它地方登录
		WebServerSocket wss = WebServerSocket.getWebSocket(String.valueOf(jober.getJno()));
		if (wss != null) {//说明你有在其它地方登录，则发送挤退信息
			System.out.println("你有在其它地方登录，发送挤退信息...");
			wss.sendMessage("100");
		}
		
		System.out.println("求职者登录成功...");
		return ResponseUtil.responseMap(200, null, null);
	}
	
	/* 求职者检查登录
	 * @param session
	 * @return
	 */
	@RequestMapping("/joberCheck")
	@ResponseBody
	public Map<String, Object> joberCheckLogin(HttpSession session) {
		Object obj = session.getAttribute("currentLoginjober");
		if (obj == null) {
			return ResponseUtil.responseMap(500,null, null);
		}
		JoberInfo joberInfo = (JoberInfo) obj;
		return ResponseUtil.responseMap(200, String.valueOf(joberInfo.getJno()), joberInfo);
	}

	//企业登录
	@RequestMapping(value = "/companyLogin", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> companyLogin(CompanyInfo companyInfo, HttpSession session) {
		
		if (loginService.companyIsBan(companyInfo) != null) {
			//账号被封禁
			System.out.println("企业账号被封禁");
			return ResponseUtil.responseMap(501, null, null);
		}
		
		System.out.println("企业登录中...");
		System.out.println("前端传过来的数据：" + companyInfo);
		CompanyInfo company = loginService.companyLogin(companyInfo);
		
		System.out.println("登录查询的结果：" + company);
		if (company == null) {
			//账号或密码错误
			System.out.println("企业账号或密码错误...");
			return ResponseUtil.responseMap(500, null, null);
		}
		
		session.setAttribute("currentLogincompany", company);
		//判断这个账号有没有在其它地方登录
		WebServerSocket wss = WebServerSocket.getWebSocket(String.valueOf(company.getCno()));
		if (wss != null) {//说明你有在其它地方登录，则发送挤退信息
			System.out.println("你有在其它地方登录，发送挤退信息...");
			wss.sendMessage("100");
		}
		
		System.out.println("企业登录成功...");
		return ResponseUtil.responseMap(200, null, null);
	}
	
	/* 企业检查登录
	 * @param session
	 * @return
	 */
	@RequestMapping("/companyCheck")
	@ResponseBody
	public Map<String, Object> companyCheckLogin(HttpSession session) {
		Object obj = session.getAttribute("currentLogincompany");
		if (obj == null) {
			return ResponseUtil.responseMap(500,null, null);
		}
		CompanyInfo companyInfo = (CompanyInfo) obj;
		return ResponseUtil.responseMap(200, String.valueOf(companyInfo.getCno()), companyInfo);
	}
	
	//求职者退出登录
	@RequestMapping("/loginout")
	public String loginout(HttpSession session) {
		System.out.println(session.getAttribute("currentLoginjober") + "下线了...");
		session.removeAttribute("currentLoginAdmin");
		session.invalidate();
		return "redirect:../login.html";
	}
	
	//求职者获取当前登录的用户名
	@RequestMapping("/getnickname")
	@ResponseBody
	public Object getnickname(HttpSession session) {
		Object obj = session.getAttribute("currentLoginjober");
		return obj;
	}
	
	//企业退出登录
	@RequestMapping("/companyloginout")
	public String companyloginout(HttpSession session) {
		System.out.println(session.getAttribute("currentLogincompany") + "下线了...");
		session.removeAttribute("currentLogincompany");
		session.invalidate();
		return "redirect:../login.html";
	}
	
	//企业获取当前登录的用户名
	@RequestMapping("/getcompanynickname")
	@ResponseBody
	public Object companygetnickname(HttpSession session) {
		Object obj = session.getAttribute("currentLogincompany");
		return obj;
	}
	
	//管理员登录
	@RequestMapping(value = "/adminLogin", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> adminLogin(AdminInfo adminInfo, HttpSession session) {
		System.out.println("管理员登录中...");
		System.out.println("前端传过来的数据：" + adminInfo);
		AdminInfo admin = loginService.adminLogin(adminInfo);
		
		System.out.println("登录查询的结果：" + admin);
		if (admin == null) {
			//账号或密码错误
			System.out.println("管理员账号或密码错误...");
			return ResponseUtil.responseMap(500, null, null);
		}
		
		session.setAttribute("currentLoginadmin", admin);
		
		System.out.println("管理员登录成功...");
		return ResponseUtil.responseMap(200, null, null);
	}
	
	
	/* 管理员检查登录
	 * @param session
	 * @return
	 */
	@RequestMapping("/adminCheck")
	@ResponseBody
	public Map<String, Object> adminCheckLogin(HttpSession session) {
		Object obj = session.getAttribute("currentLoginadmin");
		if (obj == null) {
			return ResponseUtil.responseMap(500,null, null);
		}
		AdminInfo adminInfo = (AdminInfo) obj;
		return ResponseUtil.responseMap(200, String.valueOf(adminInfo.getAid()), adminInfo);
	}
	
	//管理员退出登录
	@RequestMapping("/adminloginout")
	public String adminloginout(HttpSession session) {
		System.out.println(session.getAttribute("currentLoginadmin") + "下线了...");
		session.removeAttribute("currentLoginadmin");
		session.invalidate();
		return "redirect:../back/index.html";
	}
	
	//管理员获取当前登录的用户名
	@RequestMapping("/getadminnickname")
	@ResponseBody
	public Object admingetnickname(HttpSession session) {
		Object obj = session.getAttribute("currentLoginadmin");
		return obj;
	}
}
