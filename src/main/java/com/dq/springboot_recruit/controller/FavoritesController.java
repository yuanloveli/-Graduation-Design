package com.dq.springboot_recruit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dq.springboot_recruit.entity.Favorites;
import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.service.IFavoritesService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月13日 下午9:59:48
*/
@RestController
@RequestMapping("/favorites")
public class FavoritesController {
	@Autowired
	private IFavoritesService favoritesService;
	
	//查询所有收藏职位信息
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public Map<String, Object> findAll(Favorites favorites){
		System.out.println("前端传过来的用户名信息：" + favorites);
		return favoritesService.findAll(favorites);
	}
	
	//分页查询
	@RequestMapping(value="/findBypage", method=RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> findBypage(HttpServletRequest request){	
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int pageNo = (Integer.parseInt(request.getParameter("pageNo")) - 1) * pageSize;		
		String nickname = request.getParameter("nickname");
		return favoritesService.findBypage(pageNo, pageSize, nickname);
	}
	
	//查询收藏职位详细信息
	@RequestMapping(value="/findDetails", method=RequestMethod.GET)
	public Map<String, Object> findDetails(PositionsInfo positionsInfo){
		return favoritesService.findDetails(positionsInfo);
	}
	
	//加入收藏
	@RequestMapping(value="/addFavorties", method=RequestMethod.GET)
	public Map<String, Object> addFavorties(Favorites favorites){
		System.out.println("前端传过来的用户名信息：" + favorites);
		return favoritesService.addFavorties(favorites);
	}
	
	//取消收藏
	@RequestMapping(value="/subFavorties", method=RequestMethod.GET)
	public Map<String, Object> subFavorties(Favorites favorites){
		System.out.println("前端传过来的用户名信息：" + favorites);
		return favoritesService.subFavorties(favorites);
	}
}
