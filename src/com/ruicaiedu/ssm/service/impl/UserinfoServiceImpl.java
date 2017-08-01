package com.ruicaiedu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruicaiedu.ssm.entity.Userinfo;
import com.ruicaiedu.ssm.mapper.UserinfoMapper;
import com.ruicaiedu.ssm.service.UserinfoService;

@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoMapper userinfoMapper;
	@Override
	@Transactional
	public void saveUserinfo(Userinfo userinfo) {
		userinfoMapper.saveUserinfo(userinfo);
	}
	
	public void loginUserinfo(Userinfo userinfo){
		userinfoMapper.loginUserinfo(userinfo);
	}
}
