package com.dq.springboot_recruit.service;

import java.util.Map;

import com.dq.springboot_recruit.entity.CompanyInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 下午4:11:44
*/
public interface ICompanyInfoService {
	//查找显示企业信息
	Map<String, Object> finds(CompanyInfo companyInfo);
	//修改密码
	int updatePwd(CompanyInfo companyInfo);
	
	//查找企业的职位信息
	Map<String, Object> findAllpositions(CompanyInfo companyInfo);
	
	//分页查询
	Map<String, Object> findBypage(int pageNo, int pageSize, String nickname);

}
