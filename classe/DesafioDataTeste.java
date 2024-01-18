package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {

		// CRIANDO MÉTODOS (INSTÂNCIAS)
		DesafioData calend = new DesafioData();
		calend.dia = 23;
		calend.mes = 10;
		calend.ano = 1986;

		String dataFormatada = calend.obterDataFormatada();
		System.out.println(calend.obterDataFormatada());
		System.out.printf("Meu aniversário é:" + dataFormatada);
	}

}
