package com.practicespring.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
//		load the spring configuratiob file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
//		call methods on the bean
		
		
		System.out.println(theCoach.getSportName() +  "  " +  theCoach.getDaylyWorkout());
//		 close the context
		context.close();

	}

}
