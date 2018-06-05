package com.flight_manager;

import java.util.List;

public class SystemManager {
	
	private List<Airport> listOfAirports;
	private List<Flight> listOfFlights;
	private List<Airline> listOfAirlines;
	
	public Airport createAirport(String name) {
		// TODO Implement
		return null;
	}
	
	public Airline createAirline(String name) {
		// TODO implement
		return null;
	}
	
	public Flight createFlight(String name,String origin, String destination, Integer id) {
		// TODO implement
		return null;
	}
	
	public void createSeats(String airline,Integer flightID, Integer numberOfSeatsPerRow) {
		// TODO implement
	}
	
	public List<Flight> findAvailableFlights(String origin, String destination){
		// TODO implement
		return null;
	}
	
	public boolean bookSeat(String airline, String flightName,int seatNumber,String row) {
		// TODO implement
		return false;
	}

}
