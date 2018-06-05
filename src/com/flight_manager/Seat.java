package com.flight_manager;

public class Seat {
	// row ("A", "B", "C", "D", "E", "F")
	private String row;
	
	// seat number ex. 1,5,16
	private Integer seatNumber;
	
	//is it booked, or it is available
	private boolean available;
	
	public Seat() {
		
	}
	
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public Integer getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Seat [row=" + row + ", seatNumber=" + seatNumber + ", available=" + available + "]";
	}
	
	
	

}
