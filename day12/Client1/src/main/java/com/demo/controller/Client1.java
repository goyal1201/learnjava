package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1 {
	
	@GetMapping(value="/message")
	
	String show() {
		
		return "hello";
	}

}