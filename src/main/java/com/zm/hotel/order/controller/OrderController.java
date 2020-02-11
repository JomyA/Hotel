package com.zm.hotel.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.hotel.order.po.Order;
import com.zm.hotel.order.service.OrderService;
import com.zm.hotel.order.vo.OrderVo;
import com.zm.hotel.room.po.Room;
import com.zm.hotel.room.service.RoomService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private RoomService roomService;

	@RequestMapping("/addOrder.html")
	public String addOrder(Model model) {
		List<Room> empRooms=roomService.getEmptyRooms();
		model.addAttribute("empRooms",empRooms);
		return "orderlist-add-page";
	}
	
	
	@RequestMapping("/add")
	public String add(Order order) {
		if(roomService.getStatus(order.getRoomNum())==1) {
			System.out.println("roomStatus:"+roomService.getStatus(order.getRoomNum()));
			return "faild-add-page";
		}else {
			int i=orderService.add(order);
			if(i==1) {
				return "success-add-page";
			}else {
				return "faild-add-page";
			}
		}
	}
	
	@RequestMapping("/del/{id}")
	public String delete(@PathVariable("id") Integer id) {
		int i=orderService.delete(id);
		if(i==1) {
			return "success-del-page";
		}else {
			return "faild-del-page";
		}
	}
	
	@RequestMapping("/update")
	public String update(Order order) {
		int i=orderService.update(order);
		if(i==1) {
			return "success-update-page";
		}else {
			return "faild-update-page";
		}
	}
	
	@RequestMapping("/all")
	public String getAllOrder(OrderVo order,Model model) {
		List<OrderVo> orders= orderService.getAllOrder(order);
		model.addAttribute("orders",orders);
		return "orderlist-page";
	}
	
	@RequestMapping("/list")
	public String list(String searchOrder,Model model) {
		List<OrderVo> orders=orderService.list(searchOrder);
		model.addAttribute("orders",orders);
		System.out.println(searchOrder);
		return "orderlist-page";
	}
	
	@RequestMapping("/updateOrder/{id}")
	public String getOrderById(@PathVariable("id") Integer id,Model model) {
		OrderVo order=orderService.getOrderById(id);
		model.addAttribute("order",order);
		return "orderlist-update-page";
	}
}
