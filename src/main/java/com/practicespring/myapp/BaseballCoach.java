package com.practicespring.myapp;

public class BaseballCoach implements Coach{
	
	
//	define a private field for the dependency
	private FortuneService fortuneService;
	
	
//	define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
		
	}
	
	

	@Override
	public String getSportName() {
	
		return "Baseball coach:  ";
	}



	@Override
	public String getDailyFortune() {
//		use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
