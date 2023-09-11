package com.marcos.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcos.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
