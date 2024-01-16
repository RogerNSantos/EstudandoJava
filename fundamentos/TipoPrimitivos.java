package fundamentos;

public class TipoPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 32;
		short numeroDeVoos = 1082;
		int id = 678910;
		long pontosAcumulados = 4_245_956_334l;
		
		//Tipos númericos reais
		float salario = 22_556.44f;
		double vendasAcumuladas = 3_992_898_214.12;
		
		//Tipo boleano
		boolean estaDeFerias = false; //true
		
		//Tipo caracteres
		char status = 'A';
		
		//Dias de empresa
		System.out.println("Dias de empresa é: " + anosDeEmpresa * 365);
		
		//Números de viagens
		System.out.println("Quantidades de viagens: " + numeroDeVoos / vendasAcumuladas);
		
		// Pontos por real
		System.out.println("Pontos por viagens: " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Seu salário é: " + salario);
		System.out.println("Esta de férias? " + estaDeFerias);
		System.out.println("Status do funcionário: " + status);
		
	}
}
