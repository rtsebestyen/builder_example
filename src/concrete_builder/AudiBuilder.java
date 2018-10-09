package concrete_builder;

import builder.CarPlan;
import builder.RegularCar;
import parts.Color;
import parts.RegularBody;
import parts.RegularEngine;
import parts.RegularTires;

public class AudiBuilder implements CarBuilder{
	
	private CarPlan regularCar;
	
	public AudiBuilder() {
		this.regularCar = new RegularCar();
	}

	@Override
	public void buildTires() {
		this.regularCar.setTires(new RegularTires());
	}

	@Override
	public void buildEngine() {
		this.regularCar.setEngine(new RegularEngine());
	}

	@Override
	public void buildBody() {
		this.regularCar.setBody(new RegularBody());
	}

	@Override
	public void buildColor() {
		this.regularCar.setColor(Color.BLACK);
	}

	@Override
	public CarPlan getCar() {
		return this.regularCar;
	}

}
