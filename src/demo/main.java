package demo;

import concrete_builder.CarBuilder;
import concrete_builder.FerrariBuilder;
import director.CarEngineer;

public class main {

	public static void main(String[] args) {

		CarBuilder ferrariBuilder = new FerrariBuilder();
		CarEngineer engineer = new CarEngineer(ferrariBuilder);
		
		engineer.makeCar();
		
	}

}
