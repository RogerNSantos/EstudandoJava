package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//DesafioAritmeticos - fazendo importação de outra pasta

		//CRIANDO MÉTODOS (INSTÂNCIAS)
		Produto prod1 = new Produto ();
		prod1.nome = "Desktop";
		prod1.preco = 2450.50;
		prod1.desconto = 0.15;//25% de desconto
		 
		var prod2 = new Produto();
		prod2.nome = "Placa de Vídeo";
		prod2.preco = 1850.00;
		prod2.desconto = 0.10;//10% de desconto 
		
		double precoFinal1 = prod1.preco * (1 - prod1.desconto);
		double precoFinal2 = prod2.preco * (1 - prod2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		double totalCompras = prod1.preco + prod2.preco;
				
		System.out.printf("Nome do produto - " 
		+ prod1.nome + " Preço com desconto de 15 porcento = R$ %.2f.", precoFinal1);
		
		System.out.printf("\n\nNome do Produto - "
		+ prod2.nome + " Preço com desconto de 10 porcento R$ %.2f.", precoFinal2);
		
		System.out.printf("\nTotal da compra sem desconto = R$ %.2f.", totalCompras);
		
		System.out.printf("\n\nMéda de compras do carrinho com desconto = R$ %.2f.", mediaCarrinho);
		
	}

}
