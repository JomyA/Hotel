package com.zm.hotel.customer.dao;

import java.util.List;

import com.zm.hotel.customer.po.Customer;

public interface CustomerDao {
	
	int insert(Customer cust);
	
	int update(Customer cust);
	
	int delete(String custIdentity);
	
	List<Customer> getAllCustomer();
	
	List<Customer> list(String id);
	
	Customer getCustByIden(String identity);
}
