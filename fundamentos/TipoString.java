package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4));//Mostra a posição do caracter
		
		String frase = "Boa tarde";
		System.out.println(frase.concat("!!!"));//Concatenando
		System.out.println(frase + "???");
		System.out.println(frase.startsWith("Boa"));//Pergunta se a frase com Boa
		System.out.println(frase.toLowerCase().startsWith("boa"));//Transforma as letras em minusculos
		System.out.println(frase.endsWith("tarde"));//Pergunta se frase começa com tarde
		System.out.println(frase.length());//Quantos caracter tem a frase
		System.out.println(frase.toLowerCase().equals("boa tarde"));
		System.out.println(frase.equalsIgnoreCase("Boa noite"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var salario = 223.87;
		
		System.out.println("Meu nome é: " + nome + " de sobre nome " 
		+ sobrenome + " meu salário é R$ " + salario);
	}

}
