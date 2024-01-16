package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 5.3;
		final double PI = 3.14159; //Usando FINAL para manter o número de PI como uma constante, quando for uma constante usar em caixa alta 
		
		double area = PI * raio * raio;
		System.out.println (area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + " m2");
		
	}

}
 