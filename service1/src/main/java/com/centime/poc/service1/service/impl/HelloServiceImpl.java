package com.centime.poc.service1.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.centime.poc.service1.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	@Cacheable("hello")
	public String sayHello() throws Exception{
		System.out.println("response from service impl::::");
		Thread.sleep(10000);
		return "Hello World!";
	}

}
