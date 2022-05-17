package com.mobileapp.service;

import java.util.List;

import com.mobileapp.entity.Customer;
import com.mobileapp.exception.CustomerNotFoundException;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer cancelCustomer(Integer customerid) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers(int cid);
}
