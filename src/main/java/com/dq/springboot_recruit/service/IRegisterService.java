package com.dq.springboot_recruit.service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月8日 下午4:47:30
*/
public interface IRegisterService {
	//求职者注册
	public int joberRegister(JoberInfo joberInfo);
	//求职者注册查重
	public JoberInfo joberCheck(JoberInfo joberInfo);
	//企业注册
	public int companyRegister(CompanyInfo companyInfo);
	//企业注册查重
	public CompanyInfo companyCheck(CompanyInfo companyInfo);
}
