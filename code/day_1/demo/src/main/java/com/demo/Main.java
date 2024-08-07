package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//still passanger need to get the object of Bike
		//pull vs push
		
//		Vehicle vehicle=new Bike();
//		Passanger passanger=new Passanger(vehicle);
//		passanger.travel();
		
		AnnotationConfigApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig2.class);
		
		Passanger passanger=ctx.getBean("passanger", Passanger.class);
		passanger.travel();
	}

}
