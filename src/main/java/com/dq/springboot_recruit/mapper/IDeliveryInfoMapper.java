package com.dq.springboot_recruit.mapper;

import java.util.List;

import com.dq.springboot_recruit.entity.CompanyInfo;
import com.dq.springboot_recruit.entity.DeliveryInfo;
import com.dq.springboot_recruit.entity.ResumeInfo;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月14日 下午4:55:53
*/
public interface IDeliveryInfoMapper {
	//查找简历编号
	ResumeInfo findr(ResumeInfo resumeInfo);
	//查找企业名称
	CompanyInfo findc(CompanyInfo companyInfo);
	//添加简历
	int add(DeliveryInfo deliveryInfo);
	//查找投递记录信息
	List<DeliveryInfo> findd(DeliveryInfo deliveryInfo);
	//查找收到的简历
	List<DeliveryInfo> findReceived(DeliveryInfo deliveryInfo);
	//批准简历
	int approved(DeliveryInfo deliveryInfo);
	//拒绝简历
	int refuse(DeliveryInfo deliveryInfo);
}
