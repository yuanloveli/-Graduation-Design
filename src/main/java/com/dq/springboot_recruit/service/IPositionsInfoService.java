package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.PositionsInfo;


/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:18:51
*/
public interface IPositionsInfoService {
	//显示首页职位信息，查找每种职位类型最新的4个职位信息
	Map<String, Object> finds();

	//查询所有职位信息
	Map<String, Object> findAll();

	//分页查询
	Map<String, Object> findBypage(int pageNo, int pageSize);

	//查询详细职位信息
	Map<String, Object> findDetails(PositionsInfo positionsInfo);
	
	//分页通过关键词查询职位信息
	Map<String, Object> findBypageAndsearch(int pageNo, int pageSize, String search);
	
	//通过关键词查询所有职位信息
	Map<String, Object> findAllsearch(String search);
	//添加职位信息
	Map<String, Object> add(PositionsInfo positionsInfo);
	//修改职位信息
	Map<String, Object> updatePositions(PositionsInfo positionsInfo);

}
