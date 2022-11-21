package com.dq.springboot_recruit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.DeliveryInfo;
import com.dq.springboot_recruit.entity.ResumeInfo;
import com.dq.springboot_recruit.service.IDeliveryInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月14日 下午4:50:56
*/
@RestController
@RequestMapping("/delivery")
public class DeliveryInfoController {
	@Autowired
	private IDeliveryInfoService deliveryInfoService;
	
	//投递简历
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public Map<String, Object> add(DeliveryInfo deliveryInfo){
		System.out.println("前端传来的投递简历的信息："+ deliveryInfo);
		return deliveryInfoService.add(deliveryInfo);
	}
	
	//查找投递记录信息
	@RequestMapping(value="/findd", method=RequestMethod.GET)
	public Map<String, Object> findd(DeliveryInfo deliveryInfo){
		System.out.println("前端传来的查找投递记录信息："+ deliveryInfo);
		return deliveryInfoService.findd(deliveryInfo);
	}
	
	//查找简历编号
	@RequestMapping(value="/findr", method=RequestMethod.GET)
	public Map<String, Object> findr(ResumeInfo resumeInfo){
		System.out.println("前端传来的简历编号信息："+ resumeInfo);
		return deliveryInfoService.findr(resumeInfo);
	}
	
	//查找企业名称
	@RequestMapping(value="/findc", method=RequestMethod.GET)
	public Map<String, Object> findc(CompanyInfo companyInfo){
		System.out.println("前端传来的企业编号信息："+ companyInfo);
		return deliveryInfoService.findc(companyInfo);
	}
	
	//查找收到的简历
	@RequestMapping(value="/findReceived", method=RequestMethod.GET)
	public Map<String, Object> findReceived(DeliveryInfo deliveryInfo){
		System.out.println("前端传来的查找收到简历信息："+ deliveryInfo);
		return deliveryInfoService.findReceived(deliveryInfo);
	}
	
	//通过简历审核
	@RequestMapping(value="/approved", method=RequestMethod.GET)
	public Map<String, Object> approved(DeliveryInfo deliveryInfo){
		System.out.println("前端传来的批准简历信息："+ deliveryInfo);
		return deliveryInfoService.approved(deliveryInfo);
	}
	
	//拒绝简历
	@RequestMapping(value="/refuse", method=RequestMethod.GET)
	public Map<String, Object> refuse(DeliveryInfo deliveryInfo){
		System.out.println("前端传来的批准简历信息："+ deliveryInfo);
		return deliveryInfoService.refuse(deliveryInfo);
	}
	
}
