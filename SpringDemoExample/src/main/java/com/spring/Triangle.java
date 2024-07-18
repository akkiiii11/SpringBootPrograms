package com.spring;

public class Triangle implements Shape {

	String color;
	
	public Triangle(String color) {
		super();
		this.color = color;
	}



	@Override
	public void draw() {
		
		System.out.println("Painter is Drawing " +color+ " color Triangle");
		
	}

}
