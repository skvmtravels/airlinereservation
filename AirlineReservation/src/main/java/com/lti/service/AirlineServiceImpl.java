package com.lti.service;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Booking;
import com.lti.model.Flight;
import com.lti.model.Ticket;
import com.lti.model.User;
import com.lti.repository.AirlineRepository;

@Service
public class AirlineServiceImpl implements AirlineService {
	
	@Autowired
	AirlineRepository airlineDao;

	public Flight addFlights(Flight flight) {
		
		return airlineDao.addFlights(flight);
	}

	public void deleteFlights(int flightNo) {
		airlineDao.deleteFlights(flightNo);

	}

	public Flight updateFlights(Flight flight) {
		
		return airlineDao.updateFlights(flight);
	}

	public List<Flight> viewAllFlights() {
		
		return airlineDao.viewAllFlights();
	}

	public boolean loginAdmin(String aUserName, String aPassword) {
		
		return airlineDao.loginAdmin(aUserName, aPassword);
	}

	public boolean loginUser(String email, String password) {
		
		return airlineDao.loginUser(email, password);
	}

	public User addUser(User user) {
		
		return airlineDao.addUser(user);
	}

	public User updateAUser(User user) {
		
		return airlineDao.updateAUser(user);
	}

	public void deleteUser(int user_id) {
		
		airlineDao.deleteUser(user_id);
	}

	public User findUserById(int user_id) {
		
		return airlineDao.findUserById(user_id);
	}

	public List<User> viewAllUsers() {
		
		return airlineDao.viewAllUsers();
	}

	public List<User> findUserByLastName(String lastName) {
		
		return airlineDao.findUserByLastName(lastName);
	}

	public User findUserByEmail(String email) {
		
		return airlineDao.findUserByEmail(email);
	}

	public User findUserByBookingId(int booking_id) {
		
		return airlineDao.findUserByBookingId(booking_id);
	}

	public List<User> findUserByTicketId(int ticket_id) {
		
		return airlineDao.findUserByTicketId(ticket_id);
	}

	public Flight findFlightsById(int flight_no) {
		
		return airlineDao.findFlightsById(flight_no);
	}

	public List<Flight> findFlightsBySource(String source) {
		
		return airlineDao.findFlightsBySource(source);
	}

	public List<Flight> findFlightsByDestination(String destination) {
		
		return airlineDao.findFlightsByDestination(destination);
	}

	public List<Flight> findFlightsByDeptTime(LocalTime localTime) {
		
		return airlineDao.findFlightsByDeptTime(localTime);
	}

	public List<Flight> findFlightsByArrivalTime(LocalTime localTime) {
		
		return airlineDao.findFlightsByArrivalTime(localTime);
	}

	public List<Flight> findFlightsBySourceandDestination(String src, String des) {
		
		return airlineDao.findFlightsBySourceandDestination(src, des);
	}

	public List<Flight> findFlightsByDepTimeandArrTime(Time dep, Time arr) {
		
		return airlineDao.findFlightsByDepTimeandArrTime(dep, arr);
	}

	public String findSeatByTicketId(int ticket_id) {
		
		return airlineDao.findSeatByTicketId(ticket_id);
	}

	public boolean findStatusByTicketId(int ticket_id) {
		
		return airlineDao.findStatusByTicketId(ticket_id);
	}

	public List<Ticket> findTicketByTravelDate(LocalDate travelDate) {
		
		return airlineDao.findTicketByTravelDate(travelDate);
	}

	public List<Ticket> findTicketsByBookingId(int book_id) {
		
		return airlineDao.findTicketsByBookingId(book_id);
	}

	public List<Ticket> viewAllTickets() {
		
		return airlineDao.viewAllTickets();
	}

	public List<Ticket> viewAllTicketsByFlightNumber(int fid) {
		
		return airlineDao.viewAllTicketsByFlightNumber(fid);
	}

	public Booking findBookingById(int bookId) {
		
		return airlineDao.findBookingById(bookId);
	}

	public List<Booking> viewAllBookings() {
		
		return airlineDao.viewAllBookings();
	}

	public Ticket bookTicket(Ticket ticket) {
		
		return airlineDao.bookTicket(ticket);
	}

	public Booking userDoesBooking(Booking booking) {
		
		return airlineDao.userDoesBooking(booking);
	}

}
