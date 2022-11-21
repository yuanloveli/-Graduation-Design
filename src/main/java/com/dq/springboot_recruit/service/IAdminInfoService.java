package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;


/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月18日 下午3:25:49
*/
public interface IAdminInfoService {
	//查找显示管理员信息
	Map<String, Object> finds();

	//添加管理员信息
	int add(AdminInfo adminInfo);
	
	//重置管理员密码
	int resetPwd(AdminInfo af);

	//修改管理员信息
	int update(AdminInfo adminInfo);

	//删除管理员信息
	int delete(AdminInfo adminInfo);

	//查找显示求职者信息
	Map<String, Object> findJobersInfo();
	
	//查找显示企业信息findCompany
	Map<String, Object> findCompany();
	
	//修改求职者信息
	int updateJober(JoberInfo joberInfo);
	
	//删除求职者信息
	int deleteJober(JoberInfo joberInfo);

	//修改企业信息
	int updateCompany(CompanyInfo companyInfo);

	//删除企业信息
	int deleteCompany(CompanyInfo companyInfo);
	
	//分页查找职位信息findPositionsByPage
	Map<String, Object> findPositionsByPage(int pageNo, int pageSize);

	//分页查找职位信息总页数findTotalPositions
	Map<String, Object> findTotalPositions();

	//解封企业
	int reCompany(CompanyInfo companyInfo);

}
