package classe;

public class Produto {

	// CRIANDO OS ATRIBUTOS DO PRODUTO (OBJETO)
	String nome;
	double preco;
	double desconto;

	// CRIANDO O MÉTODO
	double precoComDesconto() {
		return preco * (1 - desconto);

	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - descontoDoGerente);
	}
}
