package com.practicespring.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
//		load the spring configuation file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//		retrieve bean from  spribg container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
												
		
		
//		call methods on the bean
		
//		close the context

	}

}
