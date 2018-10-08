package concrete_builder;

import builder.CarPlan;
import builder.RegularCar;

public class AudiBuilder implements CarBuilder{
	
	private CarPlan regularCar;
	
	public AudiBuilder() {
		this.regularCar = new RegularCar();
	}

	@Override
	public void buildTires() {
		this.regularCar.setTires("regular tires");
	}

	@Override
	public void buildEngine() {
		this.regularCar.setEngine("regular engine");
	}

	@Override
	public void buildBody() {
		this.regularCar.setBody("regular body");
	}

	@Override
	public void buildColor() {
		this.regularCar.setBody("pink");
	}

	@Override
	public CarPlan getCar() {
		return this.regularCar;
	}

}
