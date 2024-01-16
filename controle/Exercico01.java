package controle;

import java.util.Scanner;

public class Exercico01 {

	/**
	 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
	 * 10 e é par;
	 */

	public static void main(String[] args) {

		Scanner par = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = par.nextInt();

		if (num >= 1 && num <= 10) {
			if (num % 2 == 0) {
				System.out.println("Este número" + num + "está entre 0 e 10 e é par!");
			} else {
				System.out.println("Este número" + num + "Está entre 0 10 mas não é par!");
			}
		}else {
			System.out.println("Número " + num + " não está entre o 0 10!");
		}

		par.close();

	}

}
