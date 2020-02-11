package com.zm.hotel.room.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zm.hotel.room.dao.RoomDao;
import com.zm.hotel.room.po.Room;
import com.zm.hotel.room.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	private RoomDao roomDao;
	
	@Override
	public List<Room> getAllRoom() {
		return roomDao.getAllRoom();
	}

	@Override
	public List<Room> getRooms(String type) {
		return roomDao.list(type);
	}
	
	@Override
	public List<Room> searchRooms(String roomType,String id) {
		return roomDao.searchRooms(roomType,id);
	}

	@Override
	public int updateRoomInfo(Room room) {
		return roomDao.update(room);
	}

	@Override
	public int deleteRoom(String roomNum) {
		return roomDao.delete(roomNum);
	}

	@Override
	public int addRoom(Room room) {
		return roomDao.insert(room);
	}

	@Override
	public int getStatus(String roomNum) {
		return roomDao.getStatus(roomNum);
	}

	@Override
	public Room getRoom(String roomNum) {
		return roomDao.getRoom(roomNum);
	}

	@Override
	public List<Room> getEmptyRooms() {
		return roomDao.getEmptyRooms();
	}
}
