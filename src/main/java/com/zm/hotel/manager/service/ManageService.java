package com.zm.hotel.manager.service;

import java.util.List;

import com.zm.hotel.manager.po.Manager;

public interface ManageService {

	//int insert(Manager manager);
	
	//int delete(String account);
	
	int update(Manager manager);
	
	Manager getManager(String account);
}
