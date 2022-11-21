package com.dq.springboot_recruit.mapper;

import java.util.List;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.PositionsInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月16日 下午4:12:40
*/
public interface ICompanyInfoMapper {
	//查找显示企业信息
	CompanyInfo finds(CompanyInfo companyInfo);
	//修改密码
	int updatePwd(CompanyInfo companyInfo);
	//查找企业的职位信息
	List<PositionsInfo> findAllpositions(CompanyInfo companyInfo);
	//分页查询
	List<PositionsInfo> findBypage(int pageNo, int pageSize, String nickname);

}
