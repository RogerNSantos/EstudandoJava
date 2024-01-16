package fundamentos;

import java.util.Scanner;

public class Exercicio01 {
	
	/** 01. Criar um programa que leia a temperatura em Celsius e 
	 * converta para Fahrenheit. */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em CelsiusºC ");
		double celsius = scanner.nextDouble();
		
		double covnversao = celsius * 1.8 + 32;
		System.out.println("Valor da conversão em Fahrenheit ºF " + covnversao);
		
		scanner.close();
		
		
	}

}
