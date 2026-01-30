package com.telusko.SeventhWebApp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathParamController {

	//localhost:8080/get/Harshith/Java Developer
		@GetMapping("/get/{name}/{domain}")
		public String generateSomeMsg(@PathVariable("name")String name, @PathVariable("domain")String domain ,Map<String, Object> model) {
			
			
		//	String specificMsg="Hey there! "+name+", I hope you have understood PathParam concept.";
		//	String generalMsg="Hey there! "+domain+", I hope you have understood PathParam concept.";
		
			String msg="Hey there! "+name+", I hope you have understood PathParam concept.";
			
		//	model.put("specific", specificMsg);
		//	model.put("general", generalMsg);
			
			model.put("msg", msg);
			return "response";
			
		}
	
}
