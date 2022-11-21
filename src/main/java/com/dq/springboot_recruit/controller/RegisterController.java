package com.dq.springboot_recruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.service.IRegisterService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月8日 下午4:26:32
*/

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private IRegisterService registerService;
	
	//求职者注册
	@RequestMapping(value = "/joberRegister", method=RequestMethod.POST)
	@ResponseBody
	private int joberRegister(JoberInfo joberInfo){
		System.out.println(joberInfo);
		int result = registerService.joberRegister(joberInfo);
		if(result > 0){
			//添加成功
			System.out.println("求职者注册成功");
			return 1;
		}
		else{
			//添加失败
			return 0;
		}
	}
	
	//企业注册
	@RequestMapping(value = "/companyRegister", method=RequestMethod.POST)
	@ResponseBody
	private int companyRegister(CompanyInfo companyInfo){
		System.out.println(companyInfo);
		int result = registerService.companyRegister(companyInfo);
		if(result > 0){
			//添加成功
			System.out.println("企业注册成功");
			return 1;
		}
		else{
			//添加失败
			return 0;
		}
	}
	
	//求职者注册查重
	@RequestMapping(value = "/joberCheck", method=RequestMethod.POST)
	@ResponseBody
	private JoberInfo joberCheck(JoberInfo joberInfo) {
		System.out.println("会员数据查重中...");
		System.out.println(joberInfo);
		//直接返回即可
	    return registerService.joberCheck(joberInfo);
	}
	
	//企业注册查重
	@RequestMapping(value = "/companyCheck", method=RequestMethod.POST)
	@ResponseBody
	private CompanyInfo companyCheck(CompanyInfo companyInfo) {
		System.out.println("企业数据查重中...");
		System.out.println(companyInfo);
		//直接返回即可
	    return registerService.companyCheck(companyInfo);
	}
}
