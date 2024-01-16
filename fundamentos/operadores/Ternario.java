package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.5;
		String resultadoFinal = media >= 7.4 ? 
				"Aprovado" : "Recuperação" ;
		
		System.out.println("Olá, o aluno está " + resultadoFinal);
		
	}

}
