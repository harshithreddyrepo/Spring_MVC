package com.telusko.FourthWebApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	Course course=new Course(101, "Spring Boot", 6000);
	
	// Return Type : Map
    @GetMapping("/courseDetails")
    public Map<String, Object> getCourseInfo3(){
    	Map<String, Object> map=new HashMap<>();
    	map.put("name", course.getName());
    	map.put("id", course.getId());
    	map.put("price", course.getPrice());
    	return map;
    }
    
 // Return Type : Void
    @GetMapping("/courseDetails1")
    public void getCourseInfo4(Map<String, Object> model) {
    	model.put("course", course);
    }
	
	// Return Type : ModelAndView
	@GetMapping("/courseDetails3")
	public ModelAndView getCourseInfo1() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("name", course.getName());
		mav.addObject("id", course.getId());
		mav.addObject("price", course.getPrice());
		mav.setViewName("courseDetails");
		return mav;
	}
	
	// Return Type : String
    @GetMapping("/courseDetails4")
	public String getCourseInfo2(Map<String, Object> map) {
		map.put("course", course);
		return "courseDetails1";
	}
    
    
}
