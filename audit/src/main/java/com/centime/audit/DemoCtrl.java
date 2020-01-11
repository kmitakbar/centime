package com.centime.audit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoCtrl {

	@GetMapping("/hi")
	@Audit
	public String name() {
		return "Hello";
	}
}
