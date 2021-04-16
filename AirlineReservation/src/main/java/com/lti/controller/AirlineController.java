package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.User;
import com.lti.service.AirlineService;

@RestController
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;
	
	@PostMapping(value = "/registeruser")
	public User addorUpdateAUser(@RequestBody User user) {
		User userPersisted = airlineService.addUser(user);

		return userPersisted;
	}
	
	@PutMapping(value="/updateuser")
	public User updateAUser(@RequestBody User user) {
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
	
	
	
	

}
