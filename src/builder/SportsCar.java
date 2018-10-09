package builder;

import parts.Body;
import parts.Color;
import parts.Engine;
import parts.Spoiler;
import parts.Tire;

public class SportsCar implements CarPlan{
	
	private Tire tires;
	private Engine engine;
	private Body body;
	private Color color;
	private Spoiler spoiler;
	
	@Override
	public void setTires(Tire tires) {
		this.tires = tires;
	}
	
	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void setBody(Body body) {
		this.body = body;
	}
	
	@Override
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setSpoiler(Spoiler spoiler) {
		this.spoiler = spoiler;
	}
	
	@Override
	public String toString() {
		return "Engine: " + this.engine.toString() + "\n" + 
				"Tires: " + this.tires.toString() + "\n" + 
				"Body: " + this.body.toString() + "\n" + 
				"Color: " + this.color.name() + "\n" + 
				"Spoiler: " + this.spoiler.toString();
	}

}
