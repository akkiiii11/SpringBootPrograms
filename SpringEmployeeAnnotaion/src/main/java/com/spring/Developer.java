package com.spring;

import org.springframework.stereotype.Component;

@Component("Akanksha")
public class Developer implements Employee{

	@Override
	public void work() {
		
		System.out.println("It is work as Developer.");
		
	}

}
