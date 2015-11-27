package demo;

public class BruchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bruch b1 = new Bruch(3, 4);
		
		System.out.println(b1.toDecimal());
		b1.print();
		
		Bruch b2 = new Bruch(5, 7);
		
		Bruch erg = b1.multiplicate(b2);
		erg.print();
		
		Bruch b3 = new Bruch(1, 2);
		
		Bruch erg2 = b1.multiplicate(b2, b3);
		erg2.print();
		
	}

}


