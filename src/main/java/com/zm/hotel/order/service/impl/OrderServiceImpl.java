package com.zm.hotel.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zm.hotel.order.dao.OrderDao;
import com.zm.hotel.order.po.Order;
import com.zm.hotel.order.service.OrderService;
import com.zm.hotel.order.vo.OrderVo;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public int add(Order order) {
		return orderDao.insert(order);
	}

	@Override
	public int update(Order order) {
		return orderDao.update(order);
	}

	@Override
	public int delete(Integer id) {
		return orderDao.delete(id);
	}

	@Override
	public List<OrderVo> list(String id) {
		
		return orderDao.list(id);
	}

	@Override
	public List<OrderVo> getAllOrder(OrderVo order) {
		return orderDao.getAllOrder(order);
	}

	@Override
	public OrderVo getOrderById(Integer id) {
		return orderDao.getOrderById(id);
	}

	@Override
	public String getCustId(String roomNum) {
		return orderDao.getCustId(roomNum);
	}

}
