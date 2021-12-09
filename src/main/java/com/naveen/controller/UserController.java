package com.naveen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@GetMapping("/")
	public ModelAndView showHome(Model model) {
		ModelAndView mv=new ModelAndView();
		System.out.println("Home page Called");
		mv.addObject("message", "Spring Boot MVC Example");
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/register")
	public String showRegister(Model model) {
		System.out.println("Home page Called");
		model.addAttribute("message", "Spring Boot MVC Example");
		return "home";
	}
}
