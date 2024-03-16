package com.project.vasanth.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
  
	@GetMapping("/Flipkart")
	public String Flipkart() {
		return "home";
	}
	
	
	
	
}
