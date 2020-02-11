package com.zm.hotel.order.service;

import java.util.List;

import com.zm.hotel.order.po.Order;
import com.zm.hotel.order.vo.OrderVo;

public interface OrderService {

	int add(Order order);
	
	int update(Order order);
	
	int delete(Integer id);
	
	List<OrderVo> getAllOrder(OrderVo order);
	
	List<OrderVo> list(String id);
	
	OrderVo getOrderById(Integer id);

	String getCustId(String roomNum);
}
