package com.dubbo.service.impl;

import com.dubbo.service.IProcessData;

public class ProcessDataImpl implements IProcessData {

	public String hello(String name) {
		return "hello " + name;
	}

}
