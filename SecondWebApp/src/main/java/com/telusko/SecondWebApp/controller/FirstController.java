package com.telusko.SecondWebApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.SecondWebApp.service.IGreetingService;

@Controller
public class FirstController {
	
   @Autowired	
   private IGreetingService greetObj;
	
   @GetMapping("/greet")	
   public String greet(Map<String,String> map) {
	   map.put("message",greetObj.greetClient());
	   return "greetPage";
   }
   
   @GetMapping("/greetPage")
   public Map<String,String> greet2(){
	   Map<String,String> map=new HashMap<>();
	   map.put("message",greetObj.greetClient());
	   return map;
	 }
   
}
