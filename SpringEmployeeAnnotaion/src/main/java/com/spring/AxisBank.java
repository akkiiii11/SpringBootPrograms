package com.spring;

import org.springframework.stereotype.Component;

@Component("axis")
public class AxisBank implements Client {

	String empType;
	
	@Override
	public void project() {
		
		System.out.println("The " +empType+ " working for Axis Bank project.");
		
	}

}
