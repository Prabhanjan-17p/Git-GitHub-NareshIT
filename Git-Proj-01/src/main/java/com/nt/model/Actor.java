package com.nt.model;

import org.springframework.stereotype.Component;

@Component("a1")
public class Actor {
	String name;

	public Actor(String name) {
		super();
		this.name = name;
	}
	
	public void showName() {
		System.out.println("Name :: "+name);
	}
}
