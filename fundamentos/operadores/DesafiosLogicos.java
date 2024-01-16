package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV35 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV35\"? " + comprouTV35);
		System.out.println("Tomou sorvete\"? " + comprouSorvete);
		System.out.println("Está mais saudável\"? " + maisSaudavel);
		
	}
}
