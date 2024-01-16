package controle;

import java.util.Scanner;

public class Exercico05 {

	/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */

	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número: ");
		double num = entrada.nextDouble();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:

			System.out.println("\nO número " + num + "é número primo ");

		default:
			System.out.println("O número " + num + " não é número primo ");
		}

		entrada.close();

	}

}
