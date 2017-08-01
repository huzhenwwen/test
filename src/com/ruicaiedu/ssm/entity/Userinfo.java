package com.ruicaiedu.ssm.entity;

import org.springframework.stereotype.Component;

@Component//控制器（注入服务）
public class Userinfo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;

	private String userid;
	private String userpwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	
}
