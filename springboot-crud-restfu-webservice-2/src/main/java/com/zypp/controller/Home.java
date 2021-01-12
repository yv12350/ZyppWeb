package com.zypp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zypp.service.SecurityConfig;

@Controller

public class Home {
	
	
	@RequestMapping("/login/student")
	public String studentLogin() {
		return "studentlogin";
		
	}
	
	@RequestMapping("/login/teacher")
	public String teacherLogin() {
		return "teacherlogin";
	}
	

	@RequestMapping("/logout")
	public String logout() {
		return "/";
	}
	

}
