package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.AdminInfo;
import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.JoberInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月9日 下午4:13:02
*/
public interface ILoginMapper {

	//求职者登录
	JoberInfo joberLogin(JoberInfo joberInfo);

	//企业登录
	CompanyInfo companyLogin(CompanyInfo companyInfo);

	//管理员登录
	AdminInfo adminLogin(AdminInfo adminInfo);

	CompanyInfo companyIsBan(CompanyInfo companyInfo);

}
