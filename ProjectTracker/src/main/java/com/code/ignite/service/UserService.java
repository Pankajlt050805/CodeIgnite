package com.code.ignite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.ignite.exception.UserIdMismatchException;
import com.code.ignite.exception.UserNotFoundException;
import com.code.ignite.model.User;
import com.code.ignite.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	
	public Long findTotalBillableUsers() {
		return userRepository.totalBillableUsers();
	}
	
	public Long findTotalUsers() {
		return userRepository.totalUsers();
	}

	public List<User> findByName(String name) {
		return userRepository.findByName(name);
	}

	public User findOne(Long id) {
		return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
	}

	public User create(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {
		userRepository.findById(id).orElseThrow(UserNotFoundException::new);
		userRepository.deleteById(id);
	}

	public User updateUser(User user, Long id) {
		if (user.getId() != id) {
			throw new UserIdMismatchException();
		}
		return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
	}
}
