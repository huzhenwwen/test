package com.ruicaiedu.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ruicaiedu.ssm.entity.Userinfo;
import com.ruicaiedu.ssm.service.UserinfoService;

@Controller
@RequestMapping("/userinfo")
public class UserinfoController {
	@Autowired
	private UserinfoService userinfoService;
	
	@RequestMapping("/save")
	public String saveUserinfo(@ModelAttribute("userinfo") Userinfo userinfo) {
		userinfoService.saveUserinfo(userinfo);
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginUserinfo(@ModelAttribute("userinfo") Userinfo userinfo){
		userinfoService.loginUserinfo(userinfo);
		return "index";
		
	}
}
