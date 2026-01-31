package com.telusko.FormDataBinding.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegController {

	@GetMapping("/register")
	public String home()
	{
		return "register";//lvn
	}
//	@PostMapping("/register")
//	public String register(Map<String, Object>model, HttpServletRequest request)
//	{
//		Integer id=request.getParameter("id");
//		String name=request.getParameter("iname");
//		
//		return "response";//lvn
//	}
	
	@PostMapping("/register")
	public String register(Map<String, Object>model, @ModelAttribute("emp")EmployeeFormImp impl)
	{
		System.out.println(impl);
		model.put("emp", impl);
		
		return "response";//lvn
	}
}
