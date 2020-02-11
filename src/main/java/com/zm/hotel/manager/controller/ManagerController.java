package com.zm.hotel.manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zm.hotel.manager.po.Manager;
import com.zm.hotel.manager.service.ManageService;
import com.zm.hotel.room.po.Room;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManageService manageService;
	
	@RequestMapping("/getManager/{account}")
	public String getManager(@PathVariable("account") String account,Model model){
		Manager manager=manageService.getManager(account);
		model.addAttribute("manager",manager);
		return "page-user";
	}
	
	@RequestMapping("/update/{account}")
	public String getInfo(@PathVariable("account") String account,Model model) {
		Manager mana=manageService.getManager(account);
		model.addAttribute("manager",mana);
		return "page-user-update";
	}
	
	@RequestMapping("/update")
	public String update(Manager manager) {
		int i=manageService.update(manager);
		if(i==1) {
			return "success-update-page";
		}else {
			return "faild-update-page";
		}
	}
}
