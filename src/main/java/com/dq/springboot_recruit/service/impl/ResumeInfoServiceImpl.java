package com.dq.springboot_recruit.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dq.springboot_recruit.entity.ResumeInfo;
import com.dq.springboot_recruit.mapper.IResumeInfoMapper;
import com.dq.springboot_recruit.service.IResumeInfoService;

/**
* @author 作者:软件2班dq
* @version 创建时间：2021年5月12日 下午12:23:17
*/
@Service
public class ResumeInfoServiceImpl implements IResumeInfoService{
	@Autowired
	private IResumeInfoMapper resumeInfoMapper;
	
	//显示简历信息
	@Override
	public Map<String, Object> finds(ResumeInfo resumeInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		ResumeInfo ri = resumeInfoMapper.finds(resumeInfo);
		if(ri != null) {
			map.put("resume", ri);
		}else {
			System.out.println("这个用户还暂无简历信息...");
			map.put("resume", 0);
		}
		return map;
	}
	
	//创建简历
	@Override
	public int add(ResumeInfo resumeInfo) {	
		return resumeInfoMapper.add(resumeInfo);
	}
	
	//修改简历
	@Override
	public int updata(ResumeInfo resumeInfo) {	
		return resumeInfoMapper.updata(resumeInfo);
	}

	//查重简历电话和邮箱
	@Override
	public ResumeInfo check(ResumeInfo resumeInfo) {
		return resumeInfoMapper.check(resumeInfo);
	}
}
