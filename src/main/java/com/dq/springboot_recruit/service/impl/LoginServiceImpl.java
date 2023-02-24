package com.dq.springboot_recruit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;
import com.dq.springboot_recruit.mapper.ILoginMapper;
import com.dq.springboot_recruit.service.ILoginService;
import com.dq.springboot_recruit.util.StringUtil;


/**
 *
 * @author yuanli
 * @date 2023/2/23 17:11
 */

@Service
public class LoginServiceImpl implements ILoginService{
	@Autowired
	private ILoginMapper loginMapper;
	
	//求职者登录
	@Override
	public JoberInfo joberLogin(JoberInfo joberInfo) {
		if(StringUtil.checkNull(joberInfo.getNickName(), joberInfo.getPwd())){
			return null;
		}
		return loginMapper.joberLogin(joberInfo);
	}

	//企业登录
	@Override
	public CompanyInfo companyLogin(CompanyInfo companyInfo) {
		if(StringUtil.checkNull(companyInfo.getNickname(), companyInfo.getPwd())){
			return null;
		}
		return loginMapper.companyLogin(companyInfo);
	}

	//管理员登录
	@Override
	public AdminInfo adminLogin(AdminInfo adminInfo) {
		if(StringUtil.checkNull(adminInfo.getAname(), adminInfo.getPwd())){
			return null;
		}
		return loginMapper.adminLogin(adminInfo);
	}

	@Override
	public CompanyInfo companyIsBan(CompanyInfo companyInfo) {
		return loginMapper.companyIsBan(companyInfo);
	}

}
