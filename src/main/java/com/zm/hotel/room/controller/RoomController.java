package com.zm.hotel.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zm.hotel.room.po.Room;
import com.zm.hotel.room.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/all")
	public List<Room> getAllRoom(){
		return roomService.getAllRoom();
	}
	
	@RequestMapping("/list/{type}")
	public String list(@PathVariable("type") String type,Model model){
		System.out.println(type);
		List<Room> rooms=roomService.getRooms(type);
		model.addAttribute("rooms",rooms);
		if("1".equals(type)) {
			return "room-single-page";
		}else if("2".equals(type)) {
			return "room-big-page";
		}else if("3".equals(type)){
			return "room-double-page";
		}else {
			return "redirect:/room.html";
		}
	}
	
	@RequestMapping("/list/dp")
	public String searchDp(String searchRoom,Model model){
		String roomType="3";
		System.out.println("搜索的roomType："+roomType);
		System.out.println("搜索的房间信息："+searchRoom);
		List<Room> rooms=roomService.searchRooms("3",searchRoom);
		model.addAttribute("rooms",rooms);
		return "room-double-page";
	}
	
	@RequestMapping("/list/sp")
	public String searchSp(String searchRoom,Model model){
		String roomType="1";
		System.out.println("搜索的roomType："+roomType);
		System.out.println("搜索的房间信息："+searchRoom);
		List<Room> rooms=roomService.searchRooms("1",searchRoom);
		model.addAttribute("rooms",rooms);
		return "room-single-page";
	}
	
	@RequestMapping("/list/bb")
	public String searchBb(String searchRoom,Model model){
		String roomType="2";
		System.out.println("搜索的roomType："+roomType);
		System.out.println("搜索的房间信息："+searchRoom);
		List<Room> rooms=roomService.searchRooms("2",searchRoom);
		model.addAttribute("rooms",rooms);
		return "room-big-page";
	}
	
	
	@RequestMapping("/add")
	public String addRoom(Room room) {
		int i=roomService.addRoom(room);
		if(i==1) {
			return "success-add-page";
		}else {
			return "faild-add-page";
		}
	}
	
	@RequestMapping("/del/{roomNum}")
	public String delRoom(@PathVariable("roomNum") String roomNum) {
		int i=roomService.deleteRoom(roomNum);
		if(i==1) {
			return "success-del-page";
		}else {
			return "faild-del-page";
		} 
	}
	
	@RequestMapping("/update")
	public String update(Room room) {
		int i= roomService.updateRoomInfo(room);
		if(i==1) {
			return "success-update-page";
		}else {
			return "faild-update-page";
		}
	}
	
	@RequestMapping("/updateRoom/{roomNum}")
	public String updateRoom(@PathVariable("roomNum") String roomNum,Model model) {
		Room room=roomService.getRoom(roomNum);
		model.addAttribute("room",room);
		return "room-update-page";
	}
}
