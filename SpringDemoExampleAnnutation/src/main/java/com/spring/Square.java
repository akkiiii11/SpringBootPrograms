package com.spring;

import org.springframework.stereotype.Component;

@Component("squ")		//create bean of square class "squ" is a bean name
public class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Drawing a Square.");

	}


}
