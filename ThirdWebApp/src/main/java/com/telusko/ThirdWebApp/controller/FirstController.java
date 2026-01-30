package com.telusko.ThirdWebApp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.ThirdWebApp.model.Student;

import org.springframework.ui.Model;



@Controller
public class FirstController {
	
  Student s1=new Student("701","Srija",20);
  Student s2=new Student("702","Harshith",22);
  Student s3=new Student("703","Nihith",21);
  
  @GetMapping("/getDetails")
  public String studentsInfo(Model model) {
	  model.addAttribute("s1",s1);
	  model.addAttribute("s2",s2);
	  model.addAttribute("s3",s3);
	  return "studentInfo"; 
  }
}
