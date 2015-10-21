package com.dubbo.service;

import java.util.List;

import com.dubbo.service.model.User;

public interface DemoService {

	String sayHello(String name);

	public List<User> getUsers();

}
