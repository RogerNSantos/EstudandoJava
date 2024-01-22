package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//DesafioAritmeticos - fazendo importação de outra pasta

		//CRIANDO MÉTODOS (INSTÂNCIAS)
		Produto prod1 = new Produto ("Desktop", 4356.89);
		//prod1.nome = "Desktop";
		//prod1.preco = 4356.89;
		//prod1.desconto = 0.25;//25% de desconto
		 
		var prod2 = new Produto();
		prod2.nome = "Placa de Vídeo";
		prod2.preco = 12.56;
		
		Produto.desconto = 0.29;//10% de desconto 
		
		System.out.println(prod1.nome + " " + prod1.precoComDesconto());
		System.out.println(prod2.nome + " " + prod2.precoComDesconto());
				
		double precoFinal1 = prod1.precoComDesconto();
		double precoFinal2 = prod2. precoComDesconto(0.1 );
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		/**double totalCompras = prod1.preco + prod2.preco;
				
		System.out.printf("Nome do produto - " 
		+ prod1.nome + " Preço com desconto de 15 porcento = R$ %.2f.", precoFinal1);
		
		System.out.printf("\n\nNome do Produto - "
		+ prod2.nome + " Preço com desconto de 10 porcento R$ %.2f.", precoFinal2);
		
		//System.out.printf("\nTotal da compra sem desconto = R$ %.2f.", totalCompras);*/
		
		System.out.printf("Média de compras com desconto = R$ %.2f.", mediaCarrinho);
		
	}

}
