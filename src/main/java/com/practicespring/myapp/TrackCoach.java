package com.practicespring.myapp;

public class TrackCoach implements Coach {
	
	
	private FortuneService myFortune;
	
	
	public TrackCoach(FortuneService myFortune) {
		super();
		this.myFortune = myFortune;
	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return "Track Coach:  ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It:  " + myFortune.getFortune();
	}

}
