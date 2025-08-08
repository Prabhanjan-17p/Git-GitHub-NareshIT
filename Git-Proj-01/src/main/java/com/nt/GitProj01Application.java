package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.Bean1;

@SpringBootApplication
public class GitProj01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(GitProj01Application.class, args);
		
		Bean1 bean = run.getBean(Bean1.class);
		
		bean.showName();
	}

}
