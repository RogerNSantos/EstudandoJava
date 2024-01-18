package classe;

public class DesafioData {
	
	//CRIANDO ATRIBUTOS 
		int dia;
		int mes;
		int ano;
		
		String obterDataFormatada() {
			return String.format("%d/%s/%d", dia, mes, ano);
		}
		

}
