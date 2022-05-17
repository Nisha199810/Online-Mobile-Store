package com.mobileapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.entity.Customer;
import com.mobileapp.exception.CustomerNotFoundException;
import com.mobileapp.repository.CustomerRepository;

@Service // @Component
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Override
	public Customer addCustomer(Customer customer) {		
		
		return this.customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> showAllCustomers(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
