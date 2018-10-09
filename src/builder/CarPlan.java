package builder;

import parts.Body;
import parts.Color;
import parts.Engine;
import parts.Tire;

public interface CarPlan {
	public void setTires(Tire tire);
	public void setEngine(Engine engine);
	public void setBody(Body body);
	public void setColor(Color color);
	public String toString();
}
