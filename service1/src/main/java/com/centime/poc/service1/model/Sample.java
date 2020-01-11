package com.centime.poc.service1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sample {

	@Id
	@GeneratedValue
	private Integer id;
	private Integer parentId;
	private String name;
	private String color;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sample [id=" + id + ", parentId=" + parentId + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
