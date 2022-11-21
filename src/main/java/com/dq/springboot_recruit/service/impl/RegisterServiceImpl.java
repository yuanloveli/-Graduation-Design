package com.dq.springboot_recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.mapper.IRegisterMapper;
import com.dq.springboot_recruit.service.IRegisterService;
import com.dq.springboot_recruit.util.StringUtil;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月8日 下午4:48:02
*/
@Service
public class RegisterServiceImpl implements IRegisterService{
	@Autowired
	private IRegisterMapper registerMapper;

	//求职者注册
	@Override
	public int joberRegister(JoberInfo joberInfo) {
		if(StringUtil.checkNull(joberInfo.getNickName(),joberInfo.getPwd(),joberInfo.getTel(),joberInfo.getEmail())){
			return 0;
		}
		return registerMapper.joberRegister(joberInfo);
	}

	//求职者注册查重
	@Override
	public JoberInfo joberCheck(JoberInfo joberInfo) {
		return registerMapper.joberCheck(joberInfo);
	}

	//企业注册
	@Override
	public int companyRegister(CompanyInfo companyInfo) {
		if(StringUtil.checkNull(companyInfo.getCompanyname(),companyInfo.getCompanytype(),companyInfo.getCompanydescr(),companyInfo.getPwd(),companyInfo.getTel(),companyInfo.getEmail())){
			return 0;
		}
		return registerMapper.companyRegister(companyInfo);
	}

	@Override
	public CompanyInfo companyCheck(CompanyInfo companyInfo) {
		return registerMapper.companyCheck(companyInfo);
	}
	

}
