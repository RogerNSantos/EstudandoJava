package classe;

public class DesafioData {

	// CRIANDO ATRIBUTOS
	int dia;
	int mes;
	int ano;

	// CRIANDO CONSTRUTORES
	DesafioData() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);

	}

	/**
	 * DesafioData(int diaInicial, int mesInicial, int anoInicial) { dia =
	 * diaInicial; mes = mesInicial; ano = anoInicial;
	 * 
	 * }
	 */

	DesafioData(int dia, int mes, int ano) {
		this.dia = dia; 
		this.mes = mes;
		this.ano = ano;

	}

	String obterDataFormatada() {
		return String.format("%d/%s/%d", this.dia, mes, ano);
	}

}
