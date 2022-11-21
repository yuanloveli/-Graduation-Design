package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.Favorites;
import com.dq.springboot_recruit.entity.PositionsInfo;


/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午4:18:51
*/
public interface IFavoritesService {
	//查询所有收藏职位信息
	Map<String, Object> findAll(Favorites favorites);

	//分页查询
	Map<String, Object> findBypage(int pageNo, int pageSize, String nickname);

	//查询收藏职位详细信息
	Map<String, Object> findDetails(PositionsInfo positionsInfo);
	
	//加入收藏
	Map<String, Object> addFavorties(Favorites favorites);
	
	//取消收藏
	Map<String, Object> subFavorties(Favorites favorites);

}
