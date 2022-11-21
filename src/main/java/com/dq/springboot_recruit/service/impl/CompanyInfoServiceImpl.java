package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.PositionsInfo;
import com.dq.springboot_recruit.mapper.ICompanyInfoMapper;
import com.dq.springboot_recruit.service.ICompanyInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 下午4:12:08
*/
@Service
public class CompanyInfoServiceImpl implements ICompanyInfoService{
	@Autowired
	private ICompanyInfoMapper companyInfoMapper;
	
	//查找显示企业信息
	@Override
	public Map<String, Object> finds(CompanyInfo companyInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		CompanyInfo ci = companyInfoMapper.finds(companyInfo);
		if(ci == null) {
			System.out.println("企业信息查询失败...");
			map.put("company", 0);
		}else {
			System.out.println("企业信息查询成功...");
			map.put("company", ci);
		}
		return map;
	}

	//修改密码
	@Override
	public int updatePwd(CompanyInfo companyInfo) {
		return companyInfoMapper.updatePwd(companyInfo);
	}
	
	//查找企业的职位信息
	@Override
	public Map<String, Object> findAllpositions(CompanyInfo companyInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<PositionsInfo> ci = companyInfoMapper.findAllpositions(companyInfo);
		if(ci == null) {
			System.out.println("企业的职位信息查询失败...");
			map.put("positions", 0);
		}else {
			System.out.println("企业的职位信息查询成功...");
			map.put("positions", ci);
		}
		return map;
	}

	//分页查询
	@Override
	public Map<String, Object> findBypage(int pageNo, int pageSize, String nickname) {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("positions", companyInfoMapper.findBypage(pageNo, pageSize, nickname));
		return map;
	}
}
