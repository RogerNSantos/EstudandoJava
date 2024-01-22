package classe;

public class Produto {

	// CRIANDO OS ATRIBUTOS DO PRODUTO (OBJETO)
	String nome;
	double preco;
	static double desconto = 0.25;

	// INCLUINDO UM CONSTRUTOR
	Produto() {

	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;

	}

	// CRIANDO O MÉTODO
	double precoComDesconto() {
		return preco * (1 - desconto);

	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - descontoDoGerente);
	}
}
