
public class Gehaltskonto {
	
	private String inhaber;
	private String iban;
	private String bic;
	private double kontostand;
	
	
	// Konstruktor
	public Gehaltskonto(String inhaber, String iban, String bic) {
		this.inhaber = inhaber;
		this.iban = iban;
		this.bic = bic;
		this.kontostand = 0;
		
	}
	
	// getter und setter
	public String getInhaber() {
		return inhaber;
	}
	public void setInhaber(String inhaber) {
		this.inhaber = inhaber;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public double getKontostand() {
		return kontostand;
	}

	
	public void aufbuchen(double wert)
	{
		kontostand += wert;
	}
	
	public void abbuchen(double wert)
	{
		if (wert <= kontostand)
		{
			kontostand -= wert;
		}
		else
		{
			System.out.println("Leider steht nur " + kontostand + " zur Verfügung!");
		}
	}
}
