package com.practicespring.myapp;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDaylyWorkout() {
		return "spend 30 min on batting practice";
		
	}
	
	

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return "Baseball coach:  ";
	}

}
