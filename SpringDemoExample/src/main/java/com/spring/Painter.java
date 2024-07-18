package com.spring;

//There are two ways to inject the object(bean)
//1.constructor
//2.setter

public class Painter implements Performer {
	
	Shape shape;
	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void perform() {
		
		shape.draw();
		
	}

	

}
