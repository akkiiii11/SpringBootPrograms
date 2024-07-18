package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//There are two ways to inject the object(bean)
//1.constructor
//2.setter

@Component("sunny")		//create bean of Painter class "sunny" is a bean name
public class Painter implements Performer {

	//<constructor-arg ref="tri"></constructor-arg>
	@Autowired					//atomatically wired(connect) to the object(bean)
	@Qualifier("tri")			//konta object(bean) pass krnr
	Shape shape;
	
	public Painter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Shape getShape() {
		return shape;
	}




	public void setShape(Shape shape) {
		this.shape = shape;
	}




	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public void perform() {

		shape.draw();

	}



}
