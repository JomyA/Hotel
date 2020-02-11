package com.zm.hotel.room.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zm.hotel.room.po.Room;

public interface RoomDao {

	int insert(Room room);
	
	int delete(String roomNum);
	
	int update(Room room);
	
	List<Room> getAllRoom();
	
	List<Room> getEmptyRooms();
	
	List<Room> list(String type);
	
	List<Room> searchRooms(@Param("roomType") String roomType,@Param("id") String id);

	int getStatus(String roomNum);
	
	Room getRoom(String roomNum);
}
