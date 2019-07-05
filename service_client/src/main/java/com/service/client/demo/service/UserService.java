package com.service.client.demo.service;

import com.service.client.demo.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="UserService",targetNamespace = "http://service.demo.client.service.com/")
public interface UserService {
    @WebMethod
    public @WebResult String getUser();
}
