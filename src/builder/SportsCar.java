package builder;

public class SportsCar implements CarPlan{
	
	private String tires;
	private String engine;
	private String body;
	private String color;
	private String spoiler;
	
	@Override
	public void setTires(String tires) {
		this.tires = tires;
	}
	
	@Override
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	@Override
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public void setColor(String color) {
		this.body = body;
	}
	
	public void setSpoiler(String spoiler) {
		this.spoiler = spoiler;
	}

}
