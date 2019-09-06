package com.prosay.spring.service.impl;

import com.prosay.spring.dao.UserDao;
import com.prosay.spring.domain.User;
import com.prosay.spring.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("");
        }

        this.userDao.save(user);
    }
}
