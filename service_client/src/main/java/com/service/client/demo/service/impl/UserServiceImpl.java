package com.service.client.demo.service.impl;

import com.service.client.demo.entity.User;
import com.service.client.demo.service.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(
        serviceName = "UserService",
        targetNamespace = "http://www.service.demo.client.service.com",
        endpointInterface="com.service.client.demo.service.UserService")
@Component
public class UserServiceImpl implements UserService{
        @Override
        public User getUser(){
            User user = new User();
            user.setId(1);
            user.setUsername("a01");
            user.setPassword("a0101");
            return user;
            // return "abc";
        }

       @Override
        public String HelloWorld(@WebParam(name = "HelloWorld") String name){
            return "abc";
       }
}

