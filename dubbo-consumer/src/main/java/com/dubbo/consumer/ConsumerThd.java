package com.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.IProcessData;

public class ConsumerThd {
	public void sayHello() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();
		IProcessData demoService = (IProcessData) context
				.getBean("demoService");
		System.out.println(demoService.hello("world"));
	}
}