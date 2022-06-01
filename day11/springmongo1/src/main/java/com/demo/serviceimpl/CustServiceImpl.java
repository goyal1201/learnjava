package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Customer;
import com.demo.repo.MyRepo;
import com.demo.service.CustService;

@Service
public class CustServiceImpl implements CustService{
	@Autowired
	MyRepo myrepo;
	@Override
	public Customer addCustomer(Customer cust) {
		
		Customer c = myrepo.save(cust);
		
		return c;
	}

}
