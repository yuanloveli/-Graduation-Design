package com.dq.springboot_recruit.mapper;

import com.dq.springboot_recruit.entity.JoberInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月13日 下午12:55:50
*/
public interface IJoberInfoMapper {
	//查找显示求职者信息
	JoberInfo finds(JoberInfo joberInfo);
	//修改密码
	int updatePwd(JoberInfo joberInfo);

}
