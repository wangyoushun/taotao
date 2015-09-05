package com.taotao.manage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class TestController {

	@RequestMapping("/login2")
	public String test2(){
		
		System.out.println("---");
		return "login";
	}
}
