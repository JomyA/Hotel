package com.zm.hotel.order.dao;

import java.util.List;

import com.zm.hotel.order.po.Order;
import com.zm.hotel.order.vo.OrderVo;

public interface OrderDao {

	int insert(Order order);
	
	int delete(Integer id);
	
	int update(Order order);
	
	List<OrderVo> getAllOrder(OrderVo order);
	
	List<OrderVo> list(String id);
	
	OrderVo getOrderById(Integer id);

	String getCustId(String roomNum);
}
