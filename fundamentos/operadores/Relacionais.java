package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		
		int num = 97;
		int letra = 'a';
		
		System.out.println(num == letra);// == Igual
		
		System.out.println(5 > 6);//Maior
		System.out.println(6 >= 6);//Maior igual
		System.out.println(3 < 2);//Menor
		System.out.println(2 <= 2);//Menor igual
		System.out.println(15 != 14);//Diferente 
		
		double nota = 8.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Aluno tem desconto? " + temDesconto);
		
		
		
	}

}
