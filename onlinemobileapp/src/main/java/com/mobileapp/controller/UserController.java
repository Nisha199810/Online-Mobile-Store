package com.mobileapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.entity.Customer;
import com.mobileapp.service.CustomerService;

@RestController
public class UserController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return this.customerService.addCustomer(customer);
	}

}
