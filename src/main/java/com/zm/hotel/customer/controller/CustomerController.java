package com.zm.hotel.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.hotel.customer.po.Customer;
import com.zm.hotel.customer.service.CustomerService;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/add")
	public String addCust(Customer customer) {
		int i=customerService.addCustomer(customer);
		if(i==1) {
			return "success-add-page";
		}else {
			return "faild-add-page";
		}
	}
	
	@RequestMapping("/del/{custIdentity}")
	public String delCust(@PathVariable("custIdentity") String custIdentity) {
		int i=customerService.delCustomer(custIdentity);
		if(i==1) {
			return "success-del-page";
		}else {
			return "faild-del-page";
		}
 	}
	
	@RequestMapping("/update")
	public String update(Customer customer) {
		int i=customerService.updateCustomer(customer);
		if(i==1) {
			return "success-update-page";
		}else {
			return "faild-update-page";
		}
	}

	@RequestMapping("/all")
	public String getAllRoom(Model model){
		List<Customer> customers=customerService.getAllCustomer();
		model.addAttribute("customers",customers);
		return "customer-page";
	}

	@RequestMapping("/list")
	public String list(String searchCust,Model model){
		List<Customer> customers=customerService.getCustomer(searchCust);
		model.addAttribute("customers",customers);
		System.out.println(searchCust);
		return "customer-page";
	}
	
	@RequestMapping("/updateCust/{identity}")
	public String updateCust(@PathVariable("identity") String identity,Model model) {
		Customer customer=customerService.getCustByIden(identity);
		model.addAttribute("customer",customer);
		return "customer-update-page";
	}
}
