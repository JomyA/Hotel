package com.zm.hotel.room.service;

import java.util.List;

import com.zm.hotel.room.po.Room;

public interface RoomService {
	
	List<Room> getAllRoom();
	
	List<Room> getEmptyRooms();
	
	List<Room> getRooms(String type);
	
	List<Room> searchRooms(String roomType, String id);
	
	int updateRoomInfo(Room room);
	
	int deleteRoom(String roomNum);
	
	int addRoom(Room room);

	int getStatus(String roomNum);
	
	Room getRoom(String roomNum);
}
