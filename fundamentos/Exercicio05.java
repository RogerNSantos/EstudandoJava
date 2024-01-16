package fundamentos;

import java.util.Scanner;

public class Exercicio05 {
	/** 05.Criar um programa que leia o valor da base e da altura 
	 * de um triangulo e calcule a área*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A área do triangulo é: " + area);
						
		scanner.close();
	}
}
