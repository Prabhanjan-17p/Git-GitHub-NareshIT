package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component("b1")
public class Bean1 {
	@Autowired
	private Actor act;
	
	public void showName() {
		act.showName();
	}
}
