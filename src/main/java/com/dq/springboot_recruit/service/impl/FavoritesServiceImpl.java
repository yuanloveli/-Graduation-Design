package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.Favorites;
import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.mapper.IFavoritesMapper;
import com.dq.springboot_recruit.service.IFavoritesService;
/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:19:28
*/
@Service
public class FavoritesServiceImpl implements IFavoritesService{
	@Autowired
	private IFavoritesMapper favoritesInfoMapper;

	//查询所有收藏职位信息
	@Override
	public Map<String, Object> findAll(Favorites favorites) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", favoritesInfoMapper.findAll(favorites));
		
		return map;
	}

	//分页查询
	@Override
	public Map<String, Object> findBypage(int pageNo, int pageSize, String nickname) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", favoritesInfoMapper.findBypage(pageNo, pageSize, nickname));
		return map;
	}

	//查询收藏职位详细信息
	@Override
	public Map<String, Object> findDetails(PositionsInfo positionsInfo) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", favoritesInfoMapper.findDetails(positionsInfo));
		return map;
	}

	//添加收藏
	@Override
	public Map<String, Object> addFavorties(Favorites favorites) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("favorites", favoritesInfoMapper.addFavorties(favorites));
		return map;
	}
	
	//取消收藏
	@Override
	public Map<String, Object> subFavorties(Favorites favorites) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("favorites", favoritesInfoMapper.subFavorties(favorites));
		return map;
	}

}
