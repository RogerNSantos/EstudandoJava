package classe.desafio;

public class Pessoa {

	//CRIANDO ATRIBUTOS
	String nome;
	double peso;
	
	//CRIANDO CONSTRUTOR PESSOA
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	//CRIANDO CONSTRUTOR COMIDA
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu sou" + nome + " e tenho " + peso + " KGS.";
	}
}
