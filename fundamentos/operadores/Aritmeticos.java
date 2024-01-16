package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		var x = 65.32;
		double y = 23;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y );
		
		System.out.println("==========================");
				
		int a = 78;
		int b = 15;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println("=======================");
		
		System.out.println(a % b);
		System.out.println(10 % 3);
		
		System.out.println(x + y - a * b);
		
	}

}
