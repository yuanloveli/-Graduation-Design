package com.dq.springboot_recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.mapper.IForgetPwdMapper;
import com.dq.springboot_recruit.service.IForgetPwdService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 上午10:51:17
*/
@Service
public class ForgetPwdServiceImpl implements IForgetPwdService{
	@Autowired
	private IForgetPwdMapper forgetPwdMapper;
	//查询是否有求职者账号信息
	@Override
	public JoberInfo joberCheckforgetPwd(JoberInfo joberInfo) {
		return forgetPwdMapper.joberCheckforgetPwd(joberInfo);
	}
	//查询是否有企业账号信息
	@Override
	public CompanyInfo companyCheckforgetPwd(CompanyInfo companyInfo) {
		return forgetPwdMapper.companyCheckforgetPwd(companyInfo);
	}
	@Override
	public int joberUpdatePwd(JoberInfo joberInfo) {
		return forgetPwdMapper.joberUpdatePwd(joberInfo);
	}
	@Override
	public int companyUpdatePwd(CompanyInfo companyInfo) {
		return forgetPwdMapper.companyUpdatePwd(companyInfo);
	}

}
