package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		for(int y = 1; y <= 5; y++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio
		//Não pode usar valor numérico para controlar o laço!
		
		for(String arvore = "#"; !arvore.equals("######"); arvore += "#" ) {
			System.out.println(arvore);
		}
	}

}
