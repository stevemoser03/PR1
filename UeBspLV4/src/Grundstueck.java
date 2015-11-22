
public class Grundstueck {
	private String inhaber;
	private int laenge;
	private int breite;
	
	public Grundstueck(String inhaber, int laenge, int breite) {
		this.inhaber = inhaber;
		this.laenge = laenge;
		this.breite = breite;
	}

	public String getInhaber() {
		return inhaber;
	}

	public void setInhaber(String inhaber) {
		this.inhaber = inhaber;
	}

	public int getLaenge() {
		return laenge;
	}

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public int getFlaeche()
	{
		return laenge * breite;
	}
	
}
