package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.po.UserBean;
import com.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public int login(UserBean user) {
		UserDao dao = new UserDaoImpl();
		int b=dao.login(user);
		return b;
	}

	@Override
	public int reg(UserBean user) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		int b=dao.reg(user);
		return b;
	}

	@Override
	public int login(UserDao userDao) {
		// TODO Auto-generated method stub
		return 0;
	}

}
