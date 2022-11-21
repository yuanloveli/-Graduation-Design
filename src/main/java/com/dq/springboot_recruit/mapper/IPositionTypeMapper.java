package com.dq.springboot_recruit.mapper;

import java.util.List;

import com.dq.springboot_recruit.entity.PositionType;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月10日 下午5:12:17
*/
public interface IPositionTypeMapper {
	//查找职位类型
	public List<PositionType> finds();

}
