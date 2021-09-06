package com.wag.app.service;

import org.springframework.stereotype.Service;

import com.wag.app.entity.User;

@Service
public interface UserService {
	
	public User getUser(Long userId);

}
