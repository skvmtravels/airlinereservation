package com.lti.service;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.lti.model.Booking;
import com.lti.model.Flight;
import com.lti.model.Ticket;
import com.lti.model.User;

public interface AirlineService {

	public Flight addFlights(Flight flight);
	public void deleteFlights(int flightNo);
	public Flight updateFlights(Flight flight);
	public List<Flight> viewAllFlights();
	public boolean loginAdmin(String aUserName, String aPassword);
	public boolean loginUser(String email, String password);
	public User addUser(User user);
	public User updateAUser(User user);
	public void deleteUser(int user_id);
	public User findUserById(int user_id);
	public List<User> viewAllUsers();
	public List<User> findUserByLastName(String lastName);
	public User findUserByEmail(String email);
	public User findUserByBookingId(int booking_id);
	public List<User> findUserByTicketId(int ticket_id);
	public Flight findFlightsById(int flight_no);
	public List<Flight> findFlightsBySource(String source);
	public List<Flight> findFlightsByDestination(String destination);
	public List<Flight> findFlightsByDeptTime(LocalTime localTime);
	public List<Flight> findFlightsByArrivalTime(LocalTime localTime);
	public List<Flight> findFlightsBySourceandDestination(String src,String des);
	public List<Flight> findFlightsByDepTimeandArrTime(Time dep,Time arr);
	public String findSeatByTicketId(int ticket_id);
	public boolean findStatusByTicketId(int ticket_id);
	public List<Ticket> findTicketByTravelDate(LocalDate travelDate);
	public List<Ticket> findTicketsByBookingId(int book_id);
	public List<Ticket> viewAllTickets();
	public List<Ticket> viewAllTicketsByFlightNumber(int fid);
	public Booking findBookingById(int bookId);
	public List<Booking> viewAllBookings();
	public Ticket bookTicket(Ticket ticket);
	public Booking userDoesBooking(Booking booking);
}