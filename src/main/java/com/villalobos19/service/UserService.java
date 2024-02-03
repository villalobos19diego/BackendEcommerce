package com.villalobos19.service;

import com.villalobos19.exception.UserException;
import com.villalobos19.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
