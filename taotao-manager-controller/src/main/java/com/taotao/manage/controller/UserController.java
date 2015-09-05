package com.taotao.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.manage.pojo.User;
import com.taotao.manage.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/queryUsers")
	public String queryUsers(Model model){
		List<User> queryUsers = userService.queryUsers();
		System.out.println(queryUsers);
		model.addAttribute("msg", queryUsers);
		return "user";
	}

}
