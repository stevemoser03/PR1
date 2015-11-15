
public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto maxisKonto = new Konto("Max Musterman");
		
		maxisKonto.aufbuchen(1000);
		System.out.println(maxisKonto.getKontostand());
		maxisKonto.abbuchen(500);
		System.out.println(maxisKonto.getKontostand());
		maxisKonto.abbuchen(600);
		System.out.println(maxisKonto.getKontostand());
	}

}
