package com.bstek.microService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.microService.dbandcache.model.User;
import com.bstek.microService.service.UserService;

/**
*  用户信息控制层
* @author Sky
**/
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@DataProvider
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

}