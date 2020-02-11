package com.zm.hotel.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zm.hotel.customer.po.Customer;
import com.zm.hotel.room.po.Room;

@Service
public interface CustomerService {
	
	int addCustomer(Customer customer);
	
	int delCustomer(String custIdentity);
	
	int updateCustomer(Customer customer);
	
	List<Customer> getCustomer(String id);
	
	List<Customer> getAllCustomer();
	
	Customer getCustByIden(String inentity);
}
