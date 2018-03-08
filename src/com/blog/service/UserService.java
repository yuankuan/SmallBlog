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
	/**
	 * 检查用户是否存在
	 * @param username
	 * @return
	 */
	public int checkUserName(String username) {
		return userDao.checkUserName(username);
	}
	/**
	 * 检查用户账号密码是否正确
	 * @param name
	 * @param password
	 * @return
	 */
	public int checkUserPassword(String name,String password) {
		return userDao.checkUserPassword(name, password);
	}
}
