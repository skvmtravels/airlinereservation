package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.BookingDto;
import com.lti.dto.LoginDto;
import com.lti.dto.SearchFlightDto;
import com.lti.dto.TicketDto;
import com.lti.model.Booking;
import com.lti.model.Flight;
import com.lti.model.Ticket;
import com.lti.model.User;
import com.lti.service.AirlineService;

@RestController
@CrossOrigin
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	@PostMapping(value = "/registeruser")
	public User addorUpdateAUser(@RequestBody User user) {
		User userPersisted = airlineService.addUser(user);

		return userPersisted;
	}
	
	@PostMapping(value = "/loginuser")
	public boolean loginUser(@RequestBody LoginDto loginDto) {
		
		return airlineService.loginUser(loginDto.getEmail(),loginDto.getPassword());
	}
	
	@PostMapping(value = "/loginadmin")
	public boolean loginAdmin(@RequestBody LoginDto loginDto) {
		
		return airlineService.loginAdmin(loginDto.getEmail(),loginDto.getPassword());
	}
	
	@PutMapping(value="/updateuser")
	public User updateAUser(@RequestBody User user) {
		User userPersisted = airlineService.updateAUser(user);

		return userPersisted;
	}
	
	@PutMapping(value="/updateusers/{user_id}")
	public User updateAUser1(@RequestBody User user,@PathVariable("user_id") int user_id) {
		user.setUser_id(user_id);
		User userPersisted = airlineService.updateAUser(user);

		return userPersisted;
	}
	
	@DeleteMapping(value="/deleteuser/{user_id}")
	public void deleteUser(@PathVariable("user_id") int user_id) {
		airlineService.deleteUser(user_id);
	}
	
	@GetMapping(value="/users/{user_id}")
	public User findUserById(@PathVariable("user_id") int user_id) {
		User userPersisted = airlineService.findUserById(user_id);
		return userPersisted;
	}
	
	@GetMapping(value="/email/{email}")
	public User findUserByEmail(@PathVariable("email") String email) {
		User userPersisted = airlineService.findUserByEmail(email);
		return userPersisted;
	}
	
	@GetMapping(value="/viewallusers")
	public List<User> viewAllUsers() {
		List<User> userPersisted = airlineService.viewAllUsers();
		return userPersisted;
	}
	

	@GetMapping(value="/username/{lastName}")
	public List<User> findUserByLastName(@PathVariable("lastName") String lastName) {
		List<User> userPersisted = airlineService.findUserByLastName(lastName);
		return userPersisted;
	}
	
//	admin
	@PostMapping(value = "/addflight")
	public Flight addFlight(@RequestBody Flight flight) {
		Flight userPersisted = airlineService.addFlights(flight);

		return userPersisted;
	}
	
	@PutMapping(value = "/updateflight")
	public Flight updateFlight(@RequestBody Flight flight) {
		
		Flight flightPersist=airlineService.updateFlights(flight);

		return flightPersist;
	}
	
	
	
	@GetMapping(value="/viewallflights")
	public List<Flight> viewAllFlights(){
		List<Flight> flightPersist=airlineService.viewAllFlights();
		return flightPersist;
	}
	
	@DeleteMapping(value = "/deleteflight/{flight_no}")
	public void deleteFlight(@PathVariable("flight_no") int flight_no) {
		airlineService.deleteFlights(flight_no);
	}
	
	@PostMapping(value = "/searchflights")
	public List<Flight> searchFlightMain(@RequestBody SearchFlightDto searchFlightDto){
		List<Flight> flights=airlineService.searchFlightMain(searchFlightDto.getFromCity(), searchFlightDto.getToCity(),searchFlightDto.getDateT());
		return flights;
	}
	
	
//	booking
	@PostMapping(value = "/booking")
	public Booking userDoesBooking(@RequestBody BookingDto bookingDto) {
		
		Booking bookPersist=airlineService.userDoesBooking(bookingDto);	
		
		return bookPersist;
	}
	
	@PostMapping(value = "/addTickets")
	public Ticket addTickets(@RequestBody TicketDto ticketDto) {
		
		Ticket ticketPersist=airlineService.bookTicket(ticketDto);	
		
		return ticketPersist;
	}
	
	
	
	@GetMapping(value="/searchflight/{fromCity}/{toCity}")
	public List<Flight> searchFlight(@PathVariable("fromCity") String fromCity, @PathVariable("toCity") String toCity){
		List<Flight> flights=airlineService.findFlightsBySourceandDestination(fromCity, toCity);
		return flights;
	}
	
	
	

}
