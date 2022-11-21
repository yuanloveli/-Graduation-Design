package com.dq.springboot_recruit.mapper;

import java.util.List;

import com.dq.springboot_recruit.entity.PositionsInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:20:37
*/
public interface IPositionsInfoMapper {
	//显示首页职位信息，查找每种职位类型最新的4个职位信息
	List<PositionsInfo> finds();

	//查询所有职位信息
	List<PositionsInfo> findAll();

	//分页查询
	List<PositionsInfo> findBypage(int pageNo, int pageSize);

	//查询详细职位信息
	PositionsInfo findDetails(PositionsInfo positionsInfo);

	//分页通过关键词查询职位信息
	List<PositionsInfo> findBypageAndsearch(int pageNo, int pageSize, String search);
	
	//通过关键词查询所有职位信息
	List<PositionsInfo> findAllsearch(String search);
	
	//发布职位信息
	int add(PositionsInfo positionsInfo);
	//修改职位信息
	int updatePositions(PositionsInfo positionsInfo);
}
