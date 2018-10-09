package director;

import builder.CarPlan;
import concrete_builder.CarBuilder;
import concrete_builder.FerrariBuilder;

public class CarEngineer {
	private CarBuilder carBuilder;
	
	public CarEngineer(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public void makeCar() {
		this.carBuilder.buildTires();
		this.carBuilder.buildBody();
		this.carBuilder.buildColor();
		this.carBuilder.buildEngine();
		if (carBuilder instanceof FerrariBuilder) {
			((FerrariBuilder) this.carBuilder).buildSpoiler();
		}
	}
	
	public CarPlan getCar() {
		return this.carBuilder.getCar();
	}
}

