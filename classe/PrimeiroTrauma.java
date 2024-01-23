package classe;

public class PrimeiroTrauma {

	int a = 3; // Não pode mexer aqui
	static int b = 8;

	public static void main(String[] args) {

		// Pode mexer aqui
		PrimeiroTrauma r = new PrimeiroTrauma();

		System.out.println(r.a);
		System.out.println(b);
		
	}

}
