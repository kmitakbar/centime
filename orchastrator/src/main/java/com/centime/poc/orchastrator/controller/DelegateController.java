package com.centime.poc.orchastrator.controller;

/**
 * 
 * @author Akbar
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.centime.audit.Audit;
import com.centime.poc.orchastrator.model.FinalResponse;
import com.centime.poc.orchastrator.model.SecondServiceResponse;

@RestController
@RequestMapping("/api")
public class DelegateController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@GetMapping("/up")
	@Audit
	public String healthCheck() {
		return "Up...";
	}
	
	@PostMapping("/read")
	@Audit
	public FinalResponse getData(@RequestBody SecondServiceResponse secondServiceResponse) {
		ResponseEntity<String> service1Response=restTemplate.getForEntity("http://localhost:9091/service1/api/hello", String.class);
		System.out.println(service1Response.getStatusCode()+":::"+service1Response.getBody().toString());
		
		ResponseEntity<String> service2Response=restTemplate.exchange("http://localhost:9092/service2/api/save",
				HttpMethod.POST,new HttpEntity(secondServiceResponse), String.class);
		System.out.println("second service::::"+service2Response.getBody());
		
		FinalResponse finalResponse=new FinalResponse();
		finalResponse.setGreetings(service1Response.getBody().toString());
		finalResponse.setName(service2Response.getBody());
		return finalResponse;
	}
}
