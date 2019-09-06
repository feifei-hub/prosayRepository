package com.prosay.spring.service.impl;

import com.prosay.spring.domain.User;
import com.prosay.spring.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class UserServiceImplTest {

    private ApplicationContext context;
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        this.userService = (UserService) this.context.getBean("userService");

        this.userService = this.context.getBean(UserService.class);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setId(1000);
        user.setName("zhangsan");
        user.setPassword("admin");
        user.setSalary(12.34F);
        user.setBirthday(new Date());

        this.userService.addUser(user);
    }
}