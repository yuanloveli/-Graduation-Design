package com.dq.springboot_recruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.service.IForgetPwdService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 上午10:45:03
*/
@Controller
@RequestMapping("/forgetPwd")
public class ForgetPwdController {
	@Autowired
	private IForgetPwdService forgetPwdService;
	
	//查询是否有求职者账号信息
	@RequestMapping(value = "/joberCheckforgetPwd", method=RequestMethod.POST)
	@ResponseBody
	private JoberInfo joberCheckforgetPwd(JoberInfo joberInfo) {
		System.out.println("查询是否有求职者账号信息...");
		System.out.println(joberInfo);
		//直接返回即可
	    return forgetPwdService.joberCheckforgetPwd(joberInfo);
	}
	
	//查询是否有企业账号信息
	@RequestMapping(value = "/companyCheckforgetPwd", method=RequestMethod.POST)
	@ResponseBody
	private CompanyInfo companyCheckforgetPwd(CompanyInfo companyInfo) {
		System.out.println("查询是否有企业账号信息...");
		System.out.println(companyInfo);
		//直接返回即可
	    return forgetPwdService.companyCheckforgetPwd(companyInfo);
	}
	
	//修改密码
	@RequestMapping(value="/joberUpdatePwd", method=RequestMethod.POST)
	@ResponseBody
	public int joberUpdatePwd(JoberInfo joberInfo){
		System.out.println("修改密码查询的求职者信息："+ joberInfo);
		if(forgetPwdService.joberUpdatePwd(joberInfo) > 0) {
			System.out.println("密码修改成功...");
			return 1;
		}else {
			System.out.println("密码修改失败...");
			return 0;
		}	
	}
	
	//修改密码
	@RequestMapping(value="/companyUpdatePwd", method=RequestMethod.POST)
	@ResponseBody
	public int companyUpdatePwd(CompanyInfo companyInfo){
		System.out.println("修改密码查询的企业信息："+ companyInfo);
		if(forgetPwdService.companyUpdatePwd(companyInfo) > 0) {
			System.out.println("密码修改成功...");
			return 1;
		}else {
			System.out.println("密码修改失败...");
			return 0;
		}	
	}
}
