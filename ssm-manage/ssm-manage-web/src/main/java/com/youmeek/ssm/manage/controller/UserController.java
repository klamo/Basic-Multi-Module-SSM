package com.youmeek.ssm.manage.controller;


import com.youmeek.ssm.manage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/deleteUserById/{userId}")
	public String deleteUserById(Model model, @PathVariable("userId") Long userId){
		this.userService.deleteUserById(userId);
		return "showUser";
	}

	
	



}
