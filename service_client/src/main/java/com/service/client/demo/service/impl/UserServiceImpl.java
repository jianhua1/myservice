package com.service.client.demo.service.impl;

import com.service.client.demo.service.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component("UserServiceImpl")
@WebService(
        serviceName = "UserService",
        targetNamespace = "http://service.demo.client.service.com/",
        endpointInterface="com.service.client.demo.service.UserService")
public class UserServiceImpl implements UserService{
        @Override
        public String getUser(){
            // User user = new User();
            // user.setId(1);
            // user.setUsername("a01");
            // user.setPassword("a0101");
            // return user;
            return "abc";
        }

    }

