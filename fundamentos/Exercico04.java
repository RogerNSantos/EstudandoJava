package fundamentos;

import java.util.Scanner;

public class Exercico04 {
	
	/** 04. Criar um programa que leia um valor e apresente os 
	 * resultados ao quadrado e ao cubo do valor.*/
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 System.out.println("Digite um número: ");
		 double valor = scanner.nextDouble();
		 
		 
		 /**Existe tambem a seguinte possibilidade
		 double quadrado = valor * valor;
		 double cubo = valor * valor * valor;
		 
		 System.out.println("valor ao quadrado " + quadrado);
		 System.out.println("valor ao cubo " + cubo);*/
		 
		 double quadrado = Math.pow(valor, 2);
		 double cubo = Math.pow(valor, 3);
		 
		 System.out.println("O valor ao quadrao é: " + quadrado
				 + "\n O valor ao cubo é: " + cubo);
		 	 
		 scanner.close();
	}

}
