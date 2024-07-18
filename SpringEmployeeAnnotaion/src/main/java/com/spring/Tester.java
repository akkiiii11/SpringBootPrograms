package com.spring;

import org.springframework.stereotype.Component;

@Component("Nivedita")
public class Tester implements Employee{

	@Override
	public void work() {
		
		System.out.println("it is work as Tester");
		
	}

}
