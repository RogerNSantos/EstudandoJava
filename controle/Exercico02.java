package controle;

import java.util.Scanner;

public class Exercico02 {
	/**
	 * 2. Criar um programa informa se o ano atual é um ano bissexto;
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingorme o ano: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 10) != 0 || ano % 400 == 0);
		
		if (bissexto == true) {
		System.out.println(ano + " é um ano Bissexto");
		}else {
			System.out.println(ano + " ano não Bissexto");
		}
		entrada.close();
	}

}
