package com.telusko.FirstWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	@RequestMapping("/enter")
	public ModelAndView enter() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","Hello! Welcome to the first web app.");
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/exit")
	public String exit(Model model) {
		model.addAttribute("message","Thanks for comming, visit again.");
		return "index";
	}
	
	@RequestMapping("/index")
	public void home(Map<String,Object> map) {
		System.out.println("Control inside method binded with index url");
		map.put("message","Welcome to the home page");
	}
	
}
