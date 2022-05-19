package flipkartapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import flipkartapp.bean.Customer;
import flipkartapp.service.Customerservice;

@RestController

public class Customercontroller {

	@Autowired
	
	Customerservice customerservice;
	
	@PostMapping(value="/addcustomer")
	
	
	
	Customer addcustomer(@RequestBody Customer customer) {
		
		Customer cust = customerservice.addcustomer(customer);
		
		return cust;
	
	}
}
