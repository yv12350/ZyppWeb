package com.zypp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zypp.entity.Student;
import com.zypp.entity.Teacher;
import com.zypp.service.UserService;
import com.zypp.service.UserServiceImpl;

@Controller

public class Register {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/register/student", method = RequestMethod.GET)
	public String registerStudent() {
		System.out.println("Inside Registr Student");

		return "studentregistration";
	}

	@RequestMapping(value = "/register/student", method = RequestMethod.POST)
	public ModelAndView registerUser(@Valid Student student, BindingResult bindingResult, ModelMap map) {

		ModelAndView mv = new ModelAndView();
		if (bindingResult.hasErrors()) {
			mv.addObject("successmessage", "Error Occcured");
			map.addAttribute("bindingResult", bindingResult);
		}

		else {
			userService.saveStudent(student);
			mv.addObject("successmessage", "success");

		}
		mv.addObject("user", student);
		mv.setViewName("studentlogin");
		return mv;

	}

	@RequestMapping(value = "/register/teacher", method = RequestMethod.GET)
	public String registerTeacher() {
		System.out.println("Inside Registr Teacher");

		return "teacherregistration";
	}
	
	@RequestMapping(value = "/register/teacher", method = RequestMethod.POST)
	public ModelAndView registerteacher(@Valid Teacher teacher, BindingResult bindingResult, ModelMap map) {

		ModelAndView mv = new ModelAndView();
		if (bindingResult.hasErrors()) {
			mv.addObject("successmessage", "Error Occcured");
			map.addAttribute("bindingResult", bindingResult);
		}

		else {
			userService.saveTeacher(teacher);
			mv.addObject("successmessage", "success");

		}
		mv.addObject("user", teacher);
		mv.setViewName("teacherlogin");
		return mv;

	}

}
