package com.service.electronic_service.service;

import com.service.electronic_service.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
}
