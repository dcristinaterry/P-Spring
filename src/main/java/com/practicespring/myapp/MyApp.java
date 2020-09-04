package com.practicespring.myapp;

public class MyApp {
	
	public static void main(String[] arg) {
		
		Coach thecoach = new BaseballCoach();
		
		Coach trackcoach = new TrackCoach();
		
		System.out.println(thecoach.getDaylyWorkout());
		System.out.println(trackcoach.getDaylyWorkout());
		
	}

}
