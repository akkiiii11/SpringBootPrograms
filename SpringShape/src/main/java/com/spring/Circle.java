package com.spring;

public class Circle implements Shape{

	private String color;
	
	
	
	public Circle(String color) {
		super();
		this.color = color;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Painter is drawing " +color+ " Circle");
		
	}

}
