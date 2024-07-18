package com.spring;

import org.springframework.stereotype.Component;

// component that allows annotation that allows Spring to detect our custom beans automatically
// <bean id="tri" class="com.spring.Triangle"></bean>

//triangle become a bean "tri" is bean name
@Component("tri")			
public class Triangle implements Shape {

	String color = "Green";
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {

		System.out.println("Painter is Drawing " +color+ " color Triangle");

	}

}
