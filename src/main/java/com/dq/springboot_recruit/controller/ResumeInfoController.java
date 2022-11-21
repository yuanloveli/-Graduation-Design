package com.dq.springboot_recruit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.ResumeInfo;
import com.dq.springboot_recruit.service.IResumeInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月12日 下午12:17:25
*/
@RestController
@RequestMapping("/resume")
public class ResumeInfoController {
	@Autowired
	private IResumeInfoService resumeInfoService;
	
	//显示简历信息
	@RequestMapping(value="/finds", method=RequestMethod.GET)
	public Map<String, Object> finds(ResumeInfo resumeInfo){
		System.out.println("查询的求职者简历信息："+ resumeInfo);
		return resumeInfoService.finds(resumeInfo);
	}
	
	//创建简历
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public int add(ResumeInfo resumeInfo){
		System.out.println("前端传来的求职者简历信息："+ resumeInfo);
		if(resumeInfoService.add(resumeInfo) > 0) {
			System.out.println("简历创建成功...");
			return 1;
		}else {
			System.out.println("简历创建失败...");
			return 0;
		}	
	}
	
	//修改简历
	@RequestMapping(value="/updata", method=RequestMethod.POST)
	public int updata(ResumeInfo resumeInfo){
		System.out.println("前端传来的求职者简历信息："+ resumeInfo);
		if(resumeInfoService.updata(resumeInfo) > 0) {
			System.out.println("简历修改成功...");
			return 1;
		}else {
			System.out.println("简历修改失败...");
			return 0;
		}	
	}
	
	//查重简历电话和邮箱
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public int check(ResumeInfo resumeInfo) {
		System.out.println("开始检查简历重复...");
		System.out.println("前端传来的求职者简历信息："+ resumeInfo);
		if(resumeInfoService.check(resumeInfo) != null) {
			System.out.println("简历信息有重复...");
			return 0;
		}else {
			System.out.println("简历信息无重复...");
			return 1;
		}	
	}
	
}
