package com.code.ignite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.ignite.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByName(String name);

	@Query("SELECT COUNT(u) FROM User u WHERE u.isBillable=1")
	Long totalBillableUsers();
	
	@Query("SELECT COUNT(u) FROM User u")
	Long totalUsers();
}
