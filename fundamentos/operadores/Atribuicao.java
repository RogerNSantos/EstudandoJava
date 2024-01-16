package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int y = 6;
		int x = y;
		int z = y + x;
		
		z += x; //z = z + x;
		System.out.println(z);
		
		z -= y; // z = z - y;
		System.out.println(z);
		
		z *= x; // z = z * x;
		System.out.println(z);
		
		z /= y; //z = z / y;
		System.out.println(z);
		
		z %= 2; //c = c % 2; 0 ou 1
		System.out.println(z);
	}
}
