
public class Gemeinde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grundstueck[] grundstuecke = new Grundstueck[3];
		
		grundstuecke[0] = new Grundstueck("Max Mustermann", 20, 30);
		grundstuecke[1] = new Grundstueck("Susi Sorglos", 57, 63);
		grundstuecke[2] = new Grundstueck("John Smith", 49, 112);
	
		for (int i = 0; i < grundstuecke.length; i++)
		{
			if (grundstuecke[i].getFlaeche() > 1000)
			{
				System.out.println(grundstuecke[i].getInhaber() + ": " + grundstuecke[i].getFlaeche());
			}
		}
		
	}

}
