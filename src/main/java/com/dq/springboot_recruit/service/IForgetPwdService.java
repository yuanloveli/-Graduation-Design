package com.dq.springboot_recruit.service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 上午10:49:13
*/
public interface IForgetPwdService {
	//查询是否有求职者账号信息
	public JoberInfo joberCheckforgetPwd(JoberInfo joberInfo);
	//查询是否有企业账号信息
	public CompanyInfo companyCheckforgetPwd(CompanyInfo companyInfo);
	
	public int joberUpdatePwd(JoberInfo joberInfo);
	
	public int companyUpdatePwd(CompanyInfo companyInfo);

}
