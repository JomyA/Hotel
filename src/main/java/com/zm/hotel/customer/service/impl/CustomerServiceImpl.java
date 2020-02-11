package com.zm.hotel.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zm.hotel.customer.dao.CustomerDao;
import com.zm.hotel.customer.po.Customer;
import com.zm.hotel.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	
	@Override
	public int addCustomer(Customer customer) {
		return customerDao.insert(customer);
	}

	@Override
	public int delCustomer(String custIdentity) {
		return customerDao.delete(custIdentity);
	}

	@Override
	public int updateCustomer(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public List<Customer> getCustomer(String id) {
		return customerDao.list(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	@Override
	public Customer getCustByIden(String inentity) {
		return customerDao.getCustByIden(inentity);
	}

}
