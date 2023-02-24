package com.dq.springboot_recruit.util;
/**
 *
 * @author yuanli
 * @date 2023/2/23 17:16
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMailUtil {
	@Value("${spring.mail.username}")
	private String username; //发件箱
	
	@Value("${spring.mail.password}")
	private String password; //发件箱的授权码

	public void setSendEmail(String username) {
		this.username = username;
	}

	public void setPwd(String password) {
		this.password = password;
	}
	
	public boolean sendHtmlMail(String receiveEmail, String name, String code) {
		if(StringUtil.checkNull(receiveEmail, name, code)) {
			return false;
		}
			try {
				JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
				senderImpl.setHost("smtp.qq.com"); //邮箱主机 网易则用 smtp.163.com
				senderImpl.setDefaultEncoding("utf-8");//编辑
				
				//建立邮件的消息， 我们需要发送的是html格式邮件
				MimeMessage mimeMessage = senderImpl.createMimeMessage();
				MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);

				//设置收件人， 寄件人
				messageHelper.setTo(receiveEmail);
				messageHelper.setFrom(username);
				messageHelper.setSubject("兼职招聘系统注册");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
				String str = "<!DOCTYPE html><html><head><meta charset='UTF-8'></head><body><p style='font-size: 20px;font-weight:bold;'>尊敬的："+name+",你好！</p>"
				+ "<p style='text-indent:2em; font-size: 20px;'>欢迎使用兼职招聘系统,您本次的注册码是"
				+ "<span style='font-size:30px;font-weight:bold;color:red'>"+code+"</span>, 3分钟内有效，请尽快使用！</p>"
				+ "<p style='text-align:right; padding-right: 20px;'"
				+ "<a href='http://www.QQ.html' style='font-size: 18px'>在校大学生兼职招聘系统</a></p>"
				+ "<span style='font-size: 18px; float;right; margin-right: 60px;'>" +sdf.format(new Date())+"</span></body></html>";
				
				//设置邮件正文
				messageHelper.setText(str, true);;
								
				//设置名称
				senderImpl.setUsername(username);//发件箱
				senderImpl.setPassword(password); //发件箱密码
				
				Properties prop = new Properties();
				prop.put("mail.smtp.auth", "true"); //让服务器去认证用户名和密码
				prop.put("mail.smtp.timeout", "2500");//连接超时时间
				
				senderImpl.setJavaMailProperties(prop);
				senderImpl.send(mimeMessage);
				return true;
			} catch (MailException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			return false;
	}
	
}
