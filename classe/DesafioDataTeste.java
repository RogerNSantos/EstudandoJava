package classe;

public class DesafioDataTeste {

	public static void main(String[] args) {

		//CRIANDO MÉTODOS (INSTÂNCIAS)
		DesafioData calendario = new DesafioData ();
		 calendario.dia = 23;
		 calendario.mes = "Outubro";
		 calendario.ano = 1986;
		 
		 System.out.println("Meu aniversário é " + calendario.dia + " de " 
		 + calendario.mes + " de " + calendario.ano);
		
		 //OUTRA FORMA SIMPLIFICADA
		 System.out.printf(" Meu aniversário é %d/%s/%d", calendario.dia, calendario.mes, calendario.ano);
	}

}
