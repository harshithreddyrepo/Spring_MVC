package com.telusko.FifthWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/home")
	public String showHomePage() {
		System.out.println("control in showHomePage()");
		return "home";
	}
	
	@GetMapping("/getResponse")
	public String showSomeResponse(Map<String, Object> model) {
		String[] books= {"Java", "Hibernate", "SpringBoot", "SQL"};
		model.put("books", books);
		return "response";
	}
}
