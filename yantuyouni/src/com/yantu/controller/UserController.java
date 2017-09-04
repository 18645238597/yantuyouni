package com.yantu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yantu.service.UserService.UserService;

public class UserController {
private Logger logger = Logger.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/backend/modifyPwd.html")
	@ResponseBody
	public Object modifyPwd(HttpSession session,@RequestParam String userJson){
		return userJson;
		
	}
}
