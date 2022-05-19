package flipkartapp.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flipkartapp.bean.Customer;
import flipkartapp.repositry.Mylocalrepositary;
import flipkartapp.service.Customerservice;

@Service

public class Customerserviceimp implements Customerservice {
	
	@Autowired
	
	Mylocalrepositary mylocalrepositary;

	@Override
	public Customer addcustomer(Customer customer) {
		
		Customer addcustomer = mylocalrepositary.save(customer);
		
		return addcustomer;
	}

}
