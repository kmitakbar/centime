package com.centime.poc.orchastrator.model;

/**
 * 
 * @author Akbar
 *
 */
public class SecondServiceResponse {

	private String name;
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "SecondServiceResponse [name=" + name + ", surname=" + surname + "]";
	}
	
}
