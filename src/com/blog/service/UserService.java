package com.blog.service;

import com.blog.dao.UserDao;

/**
 * 用户的service层
 * @author cier
 *
 */
public class UserService {
	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public int checkUserName(String username) {
		return userDao.checkUserName(username);
	}
}
