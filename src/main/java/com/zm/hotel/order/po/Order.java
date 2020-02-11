package com.zm.hotel.order.po;

import java.util.Date;

public class Order {

	private Integer orderId;
	private String custIdentity;
	private String roomNum;
	private Date stayTime;
	private Date leaveTime;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer id) {
		this.orderId = id;
	}
	public String getCustIdentity() {
		return custIdentity;
	}
	public void setCustIdentity(String custIdentity) {
		this.custIdentity = custIdentity;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public Date getStayTime() {
		return stayTime;
	}
	public void setStayTime(Date stayTime) {
		this.stayTime = stayTime;
	}
	public Date getLeaveTime() {
		return leaveTime;
	}
	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}
}
