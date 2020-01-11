package com.centime.poc.service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centime.poc.service1.service.HelloService;

@RestController
public class HelloWorlController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public ResponseEntity<String> sayHello() throws Exception {
		return ResponseEntity.ok(helloService.sayHello());
	}
	
	/*
	 * cache eviction can be do on periodical base by adding some cron expression
	 */
	@GetMapping("/refresh")
	@CacheEvict(value = "hello",allEntries = true)
	public String refreshCache() {
		return "Cache Refreshed!";
	}
}
