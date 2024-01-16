package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String frase = "Bom dia sol";
		frase = frase.replace("sol","Senhores");
		frase = frase.toUpperCase();
		frase = frase.concat("!!!");
		
		System.out.println(frase);
		
		String y = "Lucas".toUpperCase();
		System.out.println(y);
		
		String x = "Bom dia H"
				.replace("H", "Roger")
				.toUpperCase()
				.concat("!!!");
		System.out.println(x);
		
		//Tipos primitivos não operadores "."
		
		int b = 10;
		System.out.println(b);
	}
}
