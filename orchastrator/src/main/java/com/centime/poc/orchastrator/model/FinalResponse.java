package com.centime.poc.orchastrator.model;

/**
 * 
 * @author Akbar
 *
 */
public class FinalResponse {

	private String greetings;
	private String name;
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "FinalResponse [greetings=" + greetings + ", name=" + name + "]";
	}
	
}
