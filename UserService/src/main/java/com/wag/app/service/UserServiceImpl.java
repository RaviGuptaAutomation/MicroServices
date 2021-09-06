package com.wag.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.wag.app.entity.User;

@Component
public class UserServiceImpl implements UserService {

	
	List<User> users = new ArrayList<User>();
	User user1 = new User((long) 1311,"Ravi Gupta","8957426124");
	User user2 = new User((long) 1312,"Ekta Gupta","9019105220");	

	
	@Override
	public User getUser(Long userId) {
		
		users.add(user1);
		users.add(user2);
		
		return users.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
	}

}
