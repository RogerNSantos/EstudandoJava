package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		  Scanner entrada = new Scanner (System.in);
		  
		  System.out.println("Informe a nota do aluno");
		  double nota = entrada.nextDouble();
		  
		  if (nota > 10 || nota < 0) {
			  System.out.println("Nota inválida!!!");
		  }else if (nota >= 8.1) {
			  System.out.println("Parabéns, nota A.");
		  }else if (nota >= 6.1) {
			  System.out.println ("Parabens, noata B");
		  }else if (nota >= 4.1) {
			  System.out.println("Aluno tirou um C, Recuperação");
		  }else if (nota >= 2.1) {
			  System.out.println("Aluno tirou um D, Reprovado");
		  }else {
			  System.out.println("Tirou um E, Reprovado por não obter nota");
		  }
		  
		  System.out.println("Fim do programa");
		 	  
		   
		  entrada.close();
	}

}
