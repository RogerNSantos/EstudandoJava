package fundamentos;

import java.util.Scanner;

public class Exercico03 {
	
	/** 03. Criar um programa que leia o peso e a altura do usuário
	 * e imprima no console o IMC */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o peso do usuário: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Digite a altura do usário: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println("O IMC do usuário é: " + imc);
		
		
		
		scanner.close();
		
	}

}
