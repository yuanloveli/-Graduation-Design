package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.mapper.IPositionTypeMapper;
import com.dq.springboot_recruit.mapper.IPositionsInfoMapper;
import com.dq.springboot_recruit.service.IPositionsInfoService;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:19:28
*/
@Service
public class PositionsInfoServiceImpl implements IPositionsInfoService{
	@Autowired
	private IPositionsInfoMapper positionsInfoMapper;
	@Autowired
	private IPositionTypeMapper positionTypeMapper;

	//显示首页职位信息，查找每种职位类型最新的4个职位信息
	@Override
	public Map<String, Object> finds() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("types", positionTypeMapper.finds());
		map.put("positions", positionsInfoMapper.finds());
		
		return map;
	}

	//查询所有职位信息
	@Override
	public Map<String, Object> findAll() {
		Map<String, Object> map = new HashMap<String, Object>();

		List<PositionsInfo> pi = positionsInfoMapper.findAll();
		if(pi == null) {
			System.out.println("没有查询到职位信息...");
			map.put("positions", 0);
		}else {
			map.put("positions", pi);
		}
		return map;
	}

	//分页查询
	@Override
	public Map<String, Object> findBypage(int pageNo, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", positionsInfoMapper.findBypage(pageNo, pageSize));
		return map;
	}

	//查询详细职位信息
	@Override
	public Map<String, Object> findDetails(PositionsInfo positionsInfo) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", positionsInfoMapper.findDetails(positionsInfo));
		return map;
	}

	//分页通过关键词查询职位信息
	@Override
	public Map<String, Object> findBypageAndsearch(int pageNo, int pageSize, String search) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", positionsInfoMapper.findBypageAndsearch(pageNo, pageSize, search));
		return map;
	}

	//通过关键词查询所有职位信息
	@Override
	public Map<String, Object> findAllsearch(String search) {
		Map<String, Object> map = new HashMap<String, Object>();

		List<PositionsInfo> pi = positionsInfoMapper.findAllsearch(search);
		if(pi == null) {
			System.out.println("没有查询到职位信息...");
			map.put("positions", 0);
		}else {
			map.put("positions", positionsInfoMapper.findAllsearch(search));
		}
		return map;
	}

	//发布职位信息
	@Override
	public Map<String, Object> add(PositionsInfo positionsInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		int r = positionsInfoMapper.add(positionsInfo);
		
		if(r > 0) {
			System.out.println("职位信息发布成功...");
			map.put("positions", 1);
		} else {
			System.out.println("职位信息发布失败...");
			map.put("positions", 0);
		}
		return map;
	}

	//修改职位信息
	@Override
	public Map<String, Object> updatePositions(PositionsInfo positionsInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		int r = positionsInfoMapper.updatePositions(positionsInfo);
		
		if(r > 0) {
			System.out.println("职位信息修改成功...");
			map.put("positions", 1);
		} else {
			System.out.println("职位信息修改失败...");
			map.put("positions", 0);
		}
		return map;
	}

}
