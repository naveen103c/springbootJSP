package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.naveen.model.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public ModelAndView showHome() {
		ModelAndView mv=new ModelAndView();
		System.out.println("Home page Called");
		mv.addObject("message", "Spring Boot MVC Example");
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/register")
	public ModelAndView showRegister() {
		System.out.println("Register page Called");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
	@PostMapping("/showUser")
	public ModelAndView showUser(@RequestBody User user) {
		System.out.println("Register page Called");
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		ModelAndView mv=new ModelAndView();
		mv.addObject("User",user);
		mv.setViewName("user");
		return mv;
	}
}
