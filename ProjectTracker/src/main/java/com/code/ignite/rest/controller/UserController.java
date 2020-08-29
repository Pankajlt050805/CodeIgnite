package com.code.ignite.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.code.ignite.model.User;
import com.code.ignite.service.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/users")
@Api(value = "User", description = "List of user details", tags = { "User" })
public class UserController {

	@Autowired
	private UserService userRepository;

	@GetMapping
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	/*
	 * @GetMapping public Iterable<User> findBillableUsers() { return
	 * userRepository.findAll(); }
	 */

	@GetMapping("/{id}")
	public User findOne(@PathVariable Long id) {
		return userRepository.findOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User user) {
		return userRepository.create(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userRepository.delete(id);
	}

	@PutMapping("/{id}")
	public User updateUser(@RequestBody User user, @PathVariable Long id) {
		return userRepository.updateUser(user, id);
	}
}
