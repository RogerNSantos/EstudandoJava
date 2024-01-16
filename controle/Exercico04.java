package controle;

import java.util.Scanner;

public class Exercico04 {
	
	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número
	 *  primo.
	 */
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o número: ");
		double num = entrada.nextDouble();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0 ) {
				contadorDeDivisores ++;
			}
		}
		
		if (contadorDeDivisores ++ == 0) {
			System.out.println("\nO número " + num + " é primo");
		}else {
			System.out.println("\nO número " + num + " não é primo ");
		}			
				
		entrada.close();
		
	}

}
