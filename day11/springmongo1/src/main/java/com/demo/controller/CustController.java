package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bean.Customer;
import com.demo.service.CustService;

@RestController

public class CustController {
	@Autowired 
	
	CustService custSer;
	
	@PostMapping(value= "/add")
	
	Customer addCustomer(@RequestBody Customer cust) {
		
		
		Customer c = custSer.addCustomer(cust);
		
		return c;

	

	}

}
