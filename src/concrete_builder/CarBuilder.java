package concrete_builder;

import builder.CarPlan;

public interface CarBuilder {
	public void buildTires();
	public void buildEngine();
	public void buildBody();
	public void buildColor();
	public CarPlan getCar();
}
