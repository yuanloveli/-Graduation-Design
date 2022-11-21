package com.dq.springboot_recruit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.service.ICompanyInfoService;
import com.dq.springboot_recruit.service.IPositionsInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 下午4:05:59
*/
@RestController
@RequestMapping("/company")
public class CompanyInfoController {
	@Autowired
	private ICompanyInfoService companyInfoService;
	
	@Autowired
	private IPositionsInfoService positionsService;
	
	//查找显示企业信息
	@RequestMapping(value="/finds", method=RequestMethod.GET)
	public Map<String, Object> finds(CompanyInfo companyInfo){
		System.out.println("查询的求职者信息："+ companyInfo);
		return companyInfoService.finds(companyInfo);
	}
	
	//查找企业的职位信息
	@RequestMapping(value="/findAllpositions", method=RequestMethod.GET)
	public Map<String, Object> findAllpositions(CompanyInfo companyInfo){
		System.out.println("查询的求职者信息："+ companyInfo);
		return companyInfoService.findAllpositions(companyInfo);
	}
	
	//修改密码
	@RequestMapping(value="/updatePwd", method=RequestMethod.POST)
	public int updatePwd(CompanyInfo companyInfo){
		System.out.println("修改密码查询的求职者信息："+ companyInfo);
		if(companyInfoService.updatePwd(companyInfo) > 0) {
			System.out.println("密码修改成功...");
			return 1;
		}else {
			System.out.println("密码修改失败...");
			return 0;
		}	
	}
	
	//分页查询
	@RequestMapping(value="/findBypage", method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> findBypage(HttpServletRequest request){	
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNo = (Integer.parseInt(request.getParameter("pageNo")) - 1) * pageSize;	
		String nickname = request.getParameter("nickname");
		return companyInfoService.findBypage(pageNo, pageSize, nickname);
	}
	
	//查询详细职位信息
	@RequestMapping(value="/findDetails", method=RequestMethod.GET)
	public Map<String, Object> findDetails(PositionsInfo positionsInfo){
		return positionsService.findDetails(positionsInfo);
	}
}
