package com.spring;

public class Cricketer implements Recorder{

	String runs;	
	
	public Cricketer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cricketer(String runs) {
		super();
		this.runs = runs;
	}
	
	

	public String getRuns() {
		return runs;
	}

	public void setRuns(String runs) {
		this.runs = runs;
	}

	@Override
	public void score() {
		
		System.out.println("Cricketer Score is " +runs+ " runs in world cup 2023");
		
	}
	


}
