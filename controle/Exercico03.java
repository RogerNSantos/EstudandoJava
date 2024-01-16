package controle;

import java.util.Scanner;

public class Exercico03 {
	
	public static void main(String[] args) {
		
		/**
		 * 3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for
		 * maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0
		 * imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota parcial: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota parcial: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aluno Aprovado! " + "Sua média foi " + media );
		}else if (media >= 4) {
			System.out.println("Aluno está de Recuperação! " + "Sua média foi " + media);
		}else {
			System.out.println("Aluno Reprovado!" + "Sua média foi " + media);
		}
		
		
		entrada.close();
	}

}
