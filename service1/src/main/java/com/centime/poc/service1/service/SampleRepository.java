package com.centime.poc.service1.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centime.poc.service1.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Integer> {

}
