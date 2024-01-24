package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		// CRIANDO METODO (INSTÂNCIA)
		Comida alim1 = new Comida("Arroz", 0.180);
		Comida alim2 = new Comida("Feijão", 0.300);

		Pessoa pess1 = new Pessoa(" Rogério ", 99.8);

		System.out.println(pess1.apresentar());
		pess1.comer(alim1);

		System.out.println(pess1.apresentar());
		pess1.comer(alim2);

		System.out.println(pess1.apresentar());
	}

}
