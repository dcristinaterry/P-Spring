package com.practicespring.myapp;

public class CricketCoach implements Coach {
	
	private FortuneService myFortuneService;
	private String email;
	private String team;
	
	

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
		System.out.println("inside cricket coach setter method");
		this.myFortuneService = myFortuneService;
	}


	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("inside cricket coach setter e-mail address");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("inside cricket coach setter for the team");
		this.team = team;
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
