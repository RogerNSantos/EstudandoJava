package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a = 4;
		double b = a; // Atribuição por valor

		a++;
		b--;
		System.out.println(a + " " + b);

		DesafioData d1 = new DesafioData(1, 6, 2022);
		DesafioData d2 = d1; // Atribuição por referência (Objetos)

		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;

	}
}
