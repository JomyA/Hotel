package com.zm.hotel.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zm.hotel.manager.dao.ManagerDao;
import com.zm.hotel.manager.po.Manager;
import com.zm.hotel.manager.service.ManageService;

@Service
public class ManagerServiceImpl implements ManageService{
	
	@Autowired
	private ManagerDao managerDao;
	
	@Override
	public int update(Manager manager) {
		return managerDao.update(manager);
	}
	
	@Override
	public Manager getManager(String account){
		return managerDao.getManager(account);
	}
}
