package com.centime.poc.service1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centime.poc.service1.model.Sample;
import com.centime.poc.service1.service.SampleRepository;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@Autowired
	private SampleRepository sampleRepository;
	
	@RequestMapping("/all")
	public List<Sample> getSamples(){
		return sampleRepository.findAll();
	}
	
	@RequestMapping("/one/{id}")
	public Optional<Sample> getById(@PathVariable Integer id){
		return sampleRepository.findById(id);
	}
}
