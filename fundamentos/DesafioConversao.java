package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner conversao = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String salario1 = conversao.next().replace(",", ".");
		
		System.out.print("Informe o segundo salário: ");
		String salario2 = conversao.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salário: ");
		String salario3 = conversao.next().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		
		double media = (numero1 + numero2 + numero3 ) / 3;
		System.out.println("A média salarial é: " + media);
		
	
		conversao.close();
		
	}

}
