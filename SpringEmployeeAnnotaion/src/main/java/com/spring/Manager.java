package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Anjali")
public class Manager implements Employee {
	
	@Autowired
	@Qualifier("axis")
	Client client;
	
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Manager(Client client) {
		super();
		this.client = client;
	}





	@Override
	public void work() {
		
		client.project();
		
	}

}
