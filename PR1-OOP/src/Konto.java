
public class Konto {

	private String inhaber;


	private double kontostand;
	
	// Konstruktor
	public Konto(String inhaber)
	{
		this.inhaber = inhaber;
		kontostand = 0;
	}
	
	public double getKontostand()
	{
		return kontostand;
	}
		
	public String getInhaber() {
		return inhaber;
	}
	
	public void aufbuchen(double wert)
	{
		kontostand += wert;
	}
	
	public void abbuchen(double wert)
	{
		if (kontostand >= wert)
		{
			kontostand -= wert;
		}
		else
		{
			System.out.println("Wert ist zu hoch und kann nicht abgebucht werden");
		}
	}
	
}
