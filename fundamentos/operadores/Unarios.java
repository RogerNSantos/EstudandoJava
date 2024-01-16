package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int num1 = 6;
		int num2 = 8;
		
		num1++;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		
		System.out.println("===================================");
		++num2;
		System.out.println(num2);
		--num2;
		System.out.println(num2);
		
		System.out.println("===================================");		
		System.out.println("Mini Desafio");
		System.out.println(++num1 == num2--);
		System.out.println(num1 == num2);
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
