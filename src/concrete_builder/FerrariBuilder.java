package concrete_builder;

import builder.CarPlan;
import builder.SportsCar;
import parts.Color;
import parts.FancySpoiler;
import parts.RacingTires;
import parts.SuperBody;
import parts.V12Engine;

public class FerrariBuilder implements CarBuilder{
	
	private SportsCar sportsCar;
	
	public FerrariBuilder() {
		this.sportsCar = new SportsCar();
	}

	@Override
	public void buildTires() {
		this.sportsCar.setTires(new RacingTires());
	}

	@Override
	public void buildEngine() {
		this.sportsCar.setEngine(new V12Engine());
	}

	@Override
	public void buildBody() {
		this.sportsCar.setBody(new SuperBody());
	}

	@Override
	public void buildColor() {
		this.sportsCar.setColor(Color.RED);
	}
	
	public void buildSpoiler() {
		this.sportsCar.setSpoiler(new FancySpoiler());
	}

	@Override
	public CarPlan getCar() {
		return this.sportsCar;
	}

}
