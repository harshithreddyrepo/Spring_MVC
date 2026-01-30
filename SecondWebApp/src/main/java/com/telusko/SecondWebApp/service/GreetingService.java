package com.telusko.SecondWebApp.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String greetClient() {
		
		LocalDateTime ldt =LocalDateTime.now();
		int hr=ldt.getHour();
	    if(hr<12) {
	    	return "Good Morning";
	    }
	    if(hr<16) {
	    	return "Good Afternoon";
	    }
	    if(hr<20) {
	    	return "Good Evening";
	    }
	    
	    return "hello";
	}

}
