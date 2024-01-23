 package classe;

public class DesafioData {

	// CRIANDO ATRIBUTOS
	int dia;
	int mes;
	int ano;

	// CRIANDO CONSTRUTORES
	DesafioData() {
		dia = 1;
		mes = 1;
		ano = 1970;

	}

	DesafioData(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;

	}

	String obterDataFormatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
	}

}
