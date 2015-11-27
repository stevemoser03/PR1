
public class Car {

	public int currentGear;
	public int currentSpeed;
	public String colour;
	public String brand;
	public int year;
	
	public void nextGear()
	{
		currentGear++;
	}
	
	public void setCurrentGear(int currentGear)
	{
		this.currentGear = currentGear;
	}
	
	public void accelerate(int customSpeed)
	{
		currentSpeed += customSpeed;
	}
	
	public void accelerate()
	{
		int defaultIncrement = 10;
		currentSpeed += defaultIncrement;
	}
	
}
