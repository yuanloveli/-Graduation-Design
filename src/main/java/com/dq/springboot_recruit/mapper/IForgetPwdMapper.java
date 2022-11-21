package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 上午10:52:53
*/
public interface IForgetPwdMapper {
	//查询是否有求职者账号信息
	JoberInfo joberCheckforgetPwd(JoberInfo joberInfo);
	//查询是否有企业账号信息
	CompanyInfo companyCheckforgetPwd(CompanyInfo companyInfo);
	
	int joberUpdatePwd(JoberInfo joberInfo);
	
	int companyUpdatePwd(CompanyInfo companyInfo);

}
