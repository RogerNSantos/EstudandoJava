package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//CRIANDO MÉTODOS (INSTÂNCIAS)
		Produto prod1 = new Produto ();
		prod1.nome = "Desktop";
		prod1.preco = 245.50;
		prod1.desconto = 0.15;
		 
		var prod2 = new Produto();
		prod2.nome = "Placa de Vídeo";
		prod2.preco = 1850.00;
		prod2.desconto = 0.10; 
		
		double precoFinal1 = prod1.preco * (1 - prod1.desconto);
		double precoFinal2 = prod2.preco * (1 - prod2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Nome do produto - " 
		+ prod1.nome + " Preço = R$%.2f.", prod1.preco);
		
		System.out.printf("\n\nNome do Produto - "
		+ prod2.nome + " Preço R$%.2f.", prod2.preco);
		
		System.out.printf("\n\nMéda de compras do carrinho = R$%.2f.", mediaCarrinho);
		
	}

}
