package com.spring;

public class Painter implements Performer{
	
	Shape shape;

	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		shape.draw();
		
	}
	
	

}
