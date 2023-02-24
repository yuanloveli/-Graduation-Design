package com.dq.springboot_recruit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.service.IJoberInfoService;


/**
 *
 * @author yuanli
 * @date 2023/2/23 17:21
 */


@RestController
@RequestMapping("/jober")
public class JoberInfoController {
	@Autowired
	private IJoberInfoService joberInfoService;
	
	//查找显示求职者信息
	@RequestMapping(value="/finds", method=RequestMethod.GET)
	public Map<String, Object> finds(JoberInfo joberInfo){
		System.out.println("查询的求职者信息："+ joberInfo);
		return joberInfoService.finds(joberInfo);
	}
	

	//修改密码
	@RequestMapping(value="/updatePwd", method=RequestMethod.POST)
	public int updatePwd(JoberInfo joberInfo){
		System.out.println("修改密码查询的求职者信息："+ joberInfo);
		if(joberInfoService.updatePwd(joberInfo) > 0) {
			System.out.println("密码修改成功");
			return 1;
		}else {
			System.out.println("密码修改失败!");
			return 0;
		}	
	}
}
