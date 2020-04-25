package com.service;

import com.dao.UserDao;
import com.po.UserBean;

public interface UserService {

int reg(UserBean user);

int login(UserDao userDao);

int login(UserBean user);

}
