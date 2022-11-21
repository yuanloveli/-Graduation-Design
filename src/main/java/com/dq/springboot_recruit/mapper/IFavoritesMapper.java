package com.dq.springboot_recruit.mapper;

import java.util.List;

import com.dq.springboot_recruit.entity.Favorites;
import com.dq.springboot_recruit.entity.PositionsInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月13日 下午10:24:57
*/
public interface IFavoritesMapper {
	//查询所有收藏职位信息
	List<PositionsInfo> findAll(Favorites favorites);

	//分页查询
	List<PositionsInfo> findBypage(int pageNo, int pageSize, String nickname);

	//查询收藏职位详细信息
	PositionsInfo findDetails(PositionsInfo positionsInfo);

	//添加收藏
	int addFavorties(Favorites favorites);
	
	//取消收藏
	int subFavorties(Favorites favorites);
}
