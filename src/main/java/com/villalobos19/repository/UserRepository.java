package com.villalobos19.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.villalobos19.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
