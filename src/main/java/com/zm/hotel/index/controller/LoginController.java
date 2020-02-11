package com.zm.hotel.index.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zm.hotel.manager.po.Manager;
import com.zm.hotel.manager.service.ManageService;

@Controller
public class LoginController {
	
	@Autowired
	private ManageService manageService;
	
	@GetMapping("/main.html")
	public String login() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("account") String account,
			@RequestParam("password") String password,
			Map<String,Object> map,HttpSession session) {
		
		Manager manager=(Manager) manageService.getManager(account);
		if((!StringUtils.isEmpty(account))&&(!StringUtils.isEmpty(password))&&
				(manager.getAccount()).equals(account)&&(manager.getPassword()).equals(password)) {
			session.setAttribute("loginUser", account);
			return "redirect:/main.html";
		}else {
			map.put("msg", "用户名或密码错误");
			return "page-login";
		}
	}
	
	@RequestMapping("/room.html")
	public String room() {
		return "room-basic";
	}
		
	@RequestMapping("/addCust.html")
	public String addCust() {
		return "customer-add-page";
	}

	@RequestMapping("/addRoom.html")
	public String addRoom() {
		return "room-add-page";
	}
	
}
