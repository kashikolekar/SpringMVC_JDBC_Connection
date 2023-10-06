package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dao.UserDao;
import com.spring.Model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public int CreateUser(User user) {
		
		int i =  userDao.saveUser(user);
		
		return i;
	}

}
