  package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um dia da semana: ");

		String dia = entrada.next();
		/**
		 * if (dia.equalsIgnoreCase(dia)) { System.out.println("Dia 01"); }
		 */
		if ("domingo".equalsIgnoreCase(dia)) {
		//Letra maiúsculas("domingo".equals(dia.toLowerCase())) {
			System.out.println("Dia 1º");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("Dia 2º");
		} else if ("terca".equalsIgnoreCase(dia) || "terça".equalsIgnoreCase(dia)) {
			System.out.println("Dia 3º");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 4º");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 5º");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 6º");
		} else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
			System.out.println("Dia 7º");
		} else {
			System.out.println("Dia inválido");
		}

		entrada.close();
	}

}
