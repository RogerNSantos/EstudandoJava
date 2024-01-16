package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a nota do aluno: ");
		double nota = entrada.nextDouble();

		if (nota <= 10 && nota >= 7) {
			System.out.println("Parabens, aluno aprovado!!!");

		}

		if (nota < 7 && nota >= 4.5) {
			System.out.println("Você está de recuperação!!!");
		}

		/**
		 * if (nota < 4.5 && nota >= 0) { System.out.println("Que pena, você foi
		 * reprovado!!!");
		 * 
		 * }
		 */

		boolean criteriaDeReprovacao = nota < 4.5 && nota >= 0;
		if (criteriaDeReprovacao) {
			System.out.println("Você foi reprovado!!");
		}

		entrada.close();
	}

}
