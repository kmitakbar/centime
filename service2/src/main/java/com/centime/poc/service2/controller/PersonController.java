package com.centime.poc.service2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centime.poc.service2.model.Person;

@RestController
@RequestMapping("/api")
public class PersonController {

	@PostMapping("/save")
	public ResponseEntity<String> getName(@RequestBody Person person) {
		System.out.println("person obj:;"+person);
		if (person != null) {
			return ResponseEntity.ok(person.getName() +" "+ person.getSurname());
		} else {
			return ResponseEntity.badRequest().body("Inalid Data");
		}
	}
}
