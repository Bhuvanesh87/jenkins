package com.example.Jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String helloController()
	{
		return "Welcome to java application";
	}

}
