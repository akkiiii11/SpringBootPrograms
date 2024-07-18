package com.spring;

public class Rectangle implements Shape {

	private String color;
	
	
	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("Painter is drwaing " +color+ " Rectangle");
	}

}
