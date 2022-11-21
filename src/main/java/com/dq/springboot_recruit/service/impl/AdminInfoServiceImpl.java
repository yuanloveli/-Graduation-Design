package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.mapper.IAdminInfoInfoMapper;
import com.dq.springboot_recruit.service.IAdminInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月18日 下午3:28:22
*/
@Service
public class AdminInfoServiceImpl implements IAdminInfoService{
	@Autowired
	private IAdminInfoInfoMapper adminInfoInfoMapper;

	//查找显示管理员信息
	@Override
	public Map<String, Object> finds() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<AdminInfo> ai = adminInfoInfoMapper.finds();
		if(ai == null) {
			System.out.println("没有查询到管理员信息...");
			map.put("admin", 0);
		}else {
			map.put("admin", ai);
		}
		return map;
	}

	//添加管理员信息
	@Override
	public int add(AdminInfo adminInfo) {
		return adminInfoInfoMapper.add(adminInfo);
	}

	//重置管理员密码
	@Override
	public int resetPwd(AdminInfo af) {
		return adminInfoInfoMapper.resetPwd(af);
	}

	//修改管理员信息
	@Override
	public int update(AdminInfo adminInfo) {
		return adminInfoInfoMapper.update(adminInfo);
	}

	//删除管理员信息
	@Override
	public int delete(AdminInfo adminInfo) {
		return adminInfoInfoMapper.delete(adminInfo);
	}

	//查找显示求职者信息
	@Override
	public Map<String, Object> findJobersInfo() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<JoberInfo> ji = adminInfoInfoMapper.findJobersInfo();
		if(ji == null) {
			System.out.println("没有查询到管理员信息...");
			map.put("jobers", 0);
		}else {
			map.put("jobers", ji);
		}
		return map;
	}

	//查找显示企业信息findCompany
	@Override
	public Map<String, Object> findCompany() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<CompanyInfo> ci = adminInfoInfoMapper.findCompany();
		if(ci == null) {
			System.out.println("没有查询到企业信息...");
			map.put("company", 0);
		}else {
			map.put("company", ci);
		}
		return map;
	}

	//修改求职者信息
	@Override
	public int updateJober(JoberInfo joberInfo) {
		return adminInfoInfoMapper.updateJober(joberInfo);
	}

	//删除求职者信息
	@Override
	public int deleteJober(JoberInfo joberInfo) {
		return adminInfoInfoMapper.deleteJober(joberInfo);
	}

	//修改企业信息
	@Override
	public int updateCompany(CompanyInfo companyInfo) {
		return adminInfoInfoMapper.updateCompany(companyInfo);
	}
	
	//删除企业信息
	@Override
	public int deleteCompany(CompanyInfo companyInfo) {
		return adminInfoInfoMapper.deleteCompany(companyInfo);
	}

	//分页查找职位信息findPositionsByPage	
	@Override
	public Map<String, Object> findPositionsByPage(int pageNo, int pageSize) {
		Map<String, Object> map = new HashMap<String, Object>();
	
		map.put("positions", adminInfoInfoMapper.findPositionsByPage(pageNo, pageSize));
		return map;
	}
	
	//分页查找职位信息总页数findTotalPositions
	@Override
	public Map<String, Object> findTotalPositions() {
		Map<String, Object> map = new HashMap<String, Object>();
	
		map.put("positions", adminInfoInfoMapper.findTotalPositions());
		return map;
	}
	
	//解封企业
	@Override
	public int reCompany(CompanyInfo companyInfo) {
		return adminInfoInfoMapper.reCompany(companyInfo);
	}

}
