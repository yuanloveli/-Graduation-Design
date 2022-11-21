package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.mapper.IJoberInfoMapper;
import com.dq.springboot_recruit.service.IJoberInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月13日 下午12:55:18
*/
@Service
public class JoberInfoServiceImpl implements IJoberInfoService{
	@Autowired
	private IJoberInfoMapper joberInfoMapper;
	
	//查找显示求职者信息
	@Override
	public Map<String, Object> finds(JoberInfo joberInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		JoberInfo ji = joberInfoMapper.finds(joberInfo);
		if(ji == null) {
			System.out.println("求职者信息查询失败...");
			map.put("jober", 0);
		}else {
			System.out.println("求职者信息查询成功...");
			map.put("jober", ji);
		}
		return map;
	}

	//修改密码
	@Override
	public int updatePwd(JoberInfo joberInfo) {
		return joberInfoMapper.updatePwd(joberInfo);
	}
}
