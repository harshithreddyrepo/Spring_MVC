package com.telusko.SixthWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QureyParamController {

	//localhost:8080/get?domain=Java Developer&n=Vikram
	@GetMapping("/get")
	public String generateSomeMsg(String domain, @RequestParam("n")String name, Map<String, Object> model) {
		
		String specificMsg="Hey there! "+name+", I hope you have understood QueryParam concept.";
		String generalMsg="Hey there! "+domain+", I hope you have understood QueryParam concept.";
		
		model.put("specific", specificMsg);
		model.put("general", generalMsg);
		return "response";
		
	}
	
}
