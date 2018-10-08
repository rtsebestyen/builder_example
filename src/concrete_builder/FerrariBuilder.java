package concrete_builder;

import builder.CarPlan;
import builder.SportsCar;

public class FerrariBuilder implements CarBuilder{
	
	private SportsCar sportsCar;
	
	public FerrariBuilder() {
		this.sportsCar = new SportsCar();
	}

	@Override
	public void buildTires() {
		this.sportsCar.setTires("race tires");
	}

	@Override
	public void buildEngine() {
		this.sportsCar.setEngine("V12 engine");
	}

	@Override
	public void buildBody() {
		this.sportsCar.setBody("fancy body");
	}

	@Override
	public void buildColor() {
		this.sportsCar.setBody("red");
	}
	
	public void buildSpoiler() {
		this.sportsCar.setSpoiler("fancy spoiler");
	}

	@Override
	public CarPlan getCar() {
		return this.sportsCar;
	}

}
