package com.service.client.demo.service;

import com.service.client.demo.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="UserService",targetNamespace = "http://www.service.demo.client.service.com")
public interface UserService {
    @WebMethod
    User getUser();

    @WebMethod
    @WebResult(name = "String",targetNamespace = "")
    public String HelloWorld(@WebParam(name = "HelloName") String name);

}
