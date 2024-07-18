package com.spring;

import org.springframework.stereotype.Component;

@Component("akanksha")			//create bean of Dancer class "akanksha" is a bean name
public class Dancer implements Performer {

	@Override
	public void perform() {

		System.out.println("Dancer is Dancing on the Takatak Song.");

	}

}
