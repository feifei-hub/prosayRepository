package com.prosay.spring.dao.impl;

import com.prosay.spring.dao.UserDao;
import com.prosay.spring.domain.User;

public class UserDaoHibernateImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("hibernate add " + user);
    }
}
