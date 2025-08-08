package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	@Value("${act.name}")
	String name;
	
	public void showName() {
		System.out.println("Name :: "+name);
	}
}
