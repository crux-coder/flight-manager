package com.flight_manager;

public class Airport {
	
	private String name;
	
	
	public Airport() {
		
	}
	
	public Airport(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + "]";
	}
	
	

}
