package com.zm.hotel.manager.dao;

import java.util.List;

import com.zm.hotel.manager.po.Manager;

public interface ManagerDao {

	//int insert(Manager manager);
	
	//int delete(String account);
	
	int update(Manager manager);
	
	Manager getManager(String account);
}
