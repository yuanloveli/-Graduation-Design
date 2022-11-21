package com.dq.springboot_recruit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.service.IPositionsInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:17:40
*/
@RestController
@RequestMapping("/positions")
public class PositionsInfoController {
	@Autowired
	private IPositionsInfoService positionsService;
	
	//显示首页职位信息，查找每种职位类型最新的4个职位信息
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public Map<String, Object> finds(){
		return positionsService.finds();
	}
	
	//查询所有职位信息
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public Map<String, Object> findAll(){
		return positionsService.findAll();
	}
	
	//添加职位信息
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public Map<String, Object> add(PositionsInfo positionsInfo){
		System.out.println("前端传来的发布职位信息："+positionsInfo);
		return positionsService.add(positionsInfo);
	}
	
	//通过关键词查询所有职位信息
	@RequestMapping(value="/findAllsearch", method=RequestMethod.GET)
	public Map<String, Object> findAllsearch(HttpServletRequest request){
		String search = request.getParameter("search");
		return positionsService.findAllsearch(search);
	}
	
	//分页查询
	@RequestMapping(value="/findBypage", method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> findBypage(HttpServletRequest request){	
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNo = (Integer.parseInt(request.getParameter("pageNo")) - 1) * pageSize;		
		return positionsService.findBypage(pageNo, pageSize);
	}
	
	//查询详细职位信息
	@RequestMapping(value="/findDetails", method=RequestMethod.GET)
	public Map<String, Object> findDetails(PositionsInfo positionsInfo){
		return positionsService.findDetails(positionsInfo);
	}
	
	//分页通过关键词查询职位信息
	@RequestMapping(value="/findBypageAndsearch", method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> findBypageAndsearch(HttpServletRequest request){	
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNo = (Integer.parseInt(request.getParameter("pageNo")) - 1) * pageSize;
		String search = request.getParameter("search");
		return positionsService.findBypageAndsearch(pageNo, pageSize, search);
	}
	
	//修改职位信息
	@RequestMapping(value="/updatePositions", method=RequestMethod.GET)
	public Map<String, Object> updatePositions(PositionsInfo positionsInfo){
		return positionsService.updatePositions(positionsInfo);
	}
}
