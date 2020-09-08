package com.practicespring.myapp;

public class CricketCoach implements Coach {
	
	private FortuneService myFortuneService;
	
	

	public CricketCoach() {
		super();
		System.out.println("CricketCoach:  inside cricketcoach constructor" );
	}
	

	public CricketCoach(FortuneService myFortune) {
		super();
		this.myFortuneService = myFortune;
	}

	

// setter method that will be called my spring
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowing for 15 minutes";
	}

	@Override
	public String getSportName() {
		
		return "Cricket Coach:";
	}

	@Override
	public String getDailyFortune() {
		
		return myFortuneService.getFortune();
	}

}
