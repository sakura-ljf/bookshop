package com.dao;

import com.po.UserBean;


public interface UserDao {
	public default int reg(UserBean user) {
		return 0;
	}

	public default int login(String name,String password) {
		return 0;
	}

	public default int login(UserBean user) {
		return 0;
		

	}
	}

