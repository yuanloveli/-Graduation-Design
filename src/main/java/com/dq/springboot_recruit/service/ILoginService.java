package com.dq.springboot_recruit.service;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**
 *
 * @author yuanli
 * @date 2023/2/23 17:11
 */

public interface ILoginService {
	//求职者登录
	JoberInfo joberLogin(JoberInfo joberInfo);

	//企业登录
	CompanyInfo companyLogin(CompanyInfo companyInfo);

	//管理员登录
	AdminInfo adminLogin(AdminInfo adminInfo);

	CompanyInfo companyIsBan(CompanyInfo companyInfo);

}
