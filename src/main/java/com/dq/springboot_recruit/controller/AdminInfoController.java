package com.dq.springboot_recruit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.service.IAdminInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月18日 下午3:22:29
*/
@RestController
@RequestMapping("/admin")
public class AdminInfoController {
	@Autowired
	private IAdminInfoService adminInfoService;
	
	//查找显示管理员信息
	@RequestMapping(value="/finds", method=RequestMethod.GET)
	public Map<String, Object> finds(){
		return adminInfoService.finds();
	}
	
	//添加管理员信息
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public int add(AdminInfo adminInfo){
		System.out.println(adminInfo);
		int result = adminInfoService.add(adminInfo);
		if(result > 0){
			//添加成功
			System.out.println("管理员添加成功");
			return 1;
		}
		else{
			//添加失败
			System.out.println("管理员添加失败");
			return 0;
		}
	}
	
	//重置管理员密码
	@RequestMapping(value="/resetPwd", method=RequestMethod.POST)
	@ResponseBody
	private int resetPwd(AdminInfo adminInfo) {
		System.out.println(adminInfo);
		int result = adminInfoService.resetPwd(adminInfo);
		if(result > 0){
			//添加成功
			System.out.println("密码重置成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("密码重置失败...");
			return 0;
		}
	}
	
	//修改管理员信息
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	private int update(AdminInfo adminInfo) {
		System.out.println(adminInfo);
		int result = adminInfoService.update(adminInfo);
		if(result > 0){
			//添加成功
			System.out.println("修改管理员信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("修改管理员信息失败...");
			return 0;
		}
	}
	
	//删除管理员信息
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	private int delete(AdminInfo adminInfo) {
		System.out.println(adminInfo);
		int result = adminInfoService.delete(adminInfo);
		if(result > 0){
			//添加成功
			System.out.println("删除管理员信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("删除管理员信息失败...");
			return 0;
		}
	}
	
	
	//查找显示求职者信息
	@RequestMapping(value="/findJobersInfo", method=RequestMethod.GET)
	public Map<String, Object> findJobersInfo(){
		return adminInfoService.findJobersInfo();
	}
	
	
	//修改求职者信息
	@RequestMapping(value="/updateJober", method=RequestMethod.POST)
	@ResponseBody
	private int updateJober(JoberInfo joberInfo) {
		System.out.println(joberInfo);
		int result = adminInfoService.updateJober(joberInfo);
		if(result > 0){
			//添加成功
			System.out.println("修改求职者信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("修改求职者信息失败...");
			return 0;
		}
	}
	
	//删除求职者信息
	@RequestMapping(value="/deleteJober", method=RequestMethod.POST)
	@ResponseBody
	private int deleteJober(JoberInfo joberInfo) {
		System.out.println(joberInfo);
		int result = adminInfoService.deleteJober(joberInfo);
		if(result > 0){
			//添加成功
			System.out.println("删除求职者信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("删除求职者信息失败...");
			return 0;
		}
	}
		
	//查找显示企业信息findCompany
	@RequestMapping(value="/findCompany", method=RequestMethod.GET)
	public Map<String, Object> findCompany(){
		return adminInfoService.findCompany();
	}
	
	
	//修改企业信息
	@RequestMapping(value="/updateCompany", method=RequestMethod.POST)
	@ResponseBody
	private int updateCompany(CompanyInfo companyInfo) {
		System.out.println(companyInfo);
		int result = adminInfoService.updateCompany(companyInfo);
		if(result > 0){
			//添加成功
			System.out.println("修改企业信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("修改企业信息失败...");
			return 0;
		}
	}
	
	//封禁企业信息
	@RequestMapping(value="/deleteCompany", method=RequestMethod.POST)
	@ResponseBody
	private int deleteCompany(CompanyInfo companyInfo) {
		System.out.println(companyInfo);
		int result = adminInfoService.deleteCompany(companyInfo);
		if(result > 0){
			//添加成功
			System.out.println("删除企业信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("删除企业信息失败...");
			return 0;
		}
	}
	
	//解封企业信息
	@RequestMapping(value="/reCompany", method=RequestMethod.POST)
	@ResponseBody
	private int reCompany(CompanyInfo companyInfo) {
		System.out.println(companyInfo);
		int result = adminInfoService.reCompany(companyInfo);
		if(result > 0){
			//添加成功
			System.out.println("解封企业信息成功...");
			return 1;
		}
		else{
			//添加失败
			System.out.println("解封企业信息失败...");
			return 0;
		}
	}
	
	//分页查找职位信息findPositionsByPage
	@RequestMapping(value="/findPositionsByPage", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> findPositionsByPage(HttpServletRequest request){
		//获取参数pagesize和pageNo
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNo = (Integer.parseInt(request.getParameter("pageNo")) - 1) * pageSize;	
		return adminInfoService.findPositionsByPage(pageNo,pageSize);
	}
	
	//分页查找职位信息总页数findTotalPositions
	@RequestMapping(value="/findTotalPositions", method=RequestMethod.GET)
	public Map<String, Object> findTotalPositions(){
		return adminInfoService.findTotalPositions();
	}
}
