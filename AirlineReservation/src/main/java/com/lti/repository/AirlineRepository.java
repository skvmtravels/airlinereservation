package com.lti.repository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.lti.model.Booking;
import com.lti.model.ContactUs;
import com.lti.model.Feedback;
import com.lti.model.Flight;
import com.lti.model.Passenger;
import com.lti.model.Ticket;
import com.lti.model.User;

public interface AirlineRepository {

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
	//public List<Flight> searchFlightMain(String src, String des, LocalDate dateT);
	public List<Flight> findFlightsByDepTimeandArrTime(Time dep,Time arr);
	public String findSeatByTicketId(int ticket_id);
	public boolean findStatusByTicketId(int ticket_id);
	public List<Ticket> findTicketByTravelDate(LocalDate travelDate);
	public List<Ticket> findTicketsByBookingId(int book_id);
	public Passenger findPassengerByTicketId(int ticket_id);
	public List<Passenger> findPassengerByBookingId(int booking_id);
	public List<Ticket> viewAllTickets();
	public List<Ticket> viewAllTicketsByFlightNumber(int fid);
	public Booking findBookingById(int bookId);
	public List<Booking> viewAllBookings();
	public Ticket bookTicket(Ticket ticket);
	public Booking userDoesBooking(Booking booking);
	public Passenger addPassenger(Passenger passenger);
	public Feedback getFeedback(Feedback feedback);
	public ContactUs getcontactUs(ContactUs contactus); 
	public Passenger findPassengerById(int passenger_id);
	public List<Ticket> findSeatsByFlight(int flight_no);
	public List<Ticket> viewAllTicketsByFlightNumberS(int fid);
	public List<Booking> viewBookingByUserAndTicketTrue(int user_id);
	public List<Booking> viewBookingByUserAndTicketFalse(int user_id);
	public List<Booking> viewBookingByStatus();
	public double rechargeUserWallet(int userId, double wallet) ;
	public String changeBookingStatus(int booking_id);
	public Flight findFlightByBookingID(int booking_id);
	public String oldBookingStatus();
}
