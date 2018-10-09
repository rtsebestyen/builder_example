package demo;

import concrete_builder.AudiBuilder;
import concrete_builder.CarBuilder;
import concrete_builder.FerrariBuilder;
import director.CarEngineer;

public class main {

	public static void main(String[] args) {

		CarBuilder ferrariBuilder = new FerrariBuilder();
		CarEngineer engineer = new CarEngineer(ferrariBuilder);
		
		engineer.makeCar();
		
		System.out.println(engineer.getCar().toString()); 
		
		System.out.println("----------------");
		
		CarBuilder regularBuilder = new AudiBuilder();
		CarEngineer engineer2 = new CarEngineer(regularBuilder);
		
		engineer2.makeCar();
		
		System.out.println(engineer2.getCar().toString()); 
		
	}

}
