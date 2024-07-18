package com.spring;

/*object-> Tea and Coffee
 * Injection of tea and coffee class possible way
 *  2 ways
1. constructor
2. setter way*/

public class Restaurant 
{
	//by using constructor
	HotDrink hotdrink; // reference of HotDrink interface
	String welcomeNote;
	
	public Restaurant(HotDrink hotDrink) // pass hotDrink
	{
		super();
		this.hotdrink = hotDrink;
	}
	void prepareDrink()
	{
		hotdrink.prepareHotDrink();
	}
	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
	void greetCustomer()
	{
		System.out.println(welcomeNote);
	}
	

}
