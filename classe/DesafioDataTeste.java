package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {

		// CRIANDO MÉTODOS (INSTÂNCIAS)
		DesafioData calend = new DesafioData();
		//calend.dia = 23;
		// calend.mes = 10;
		// calend.ano = 1986;

		var calend1 = new DesafioData(23, 10, 1986);

		String dataFormatada = calend.obterDataFormatada();
		System.out.println(dataFormatada);
		System.out.printf("Meu aniversário é: " + calend1.obterDataFormatada());
		// System.out.println(calend1.obterDataFormatada());

	}

}
