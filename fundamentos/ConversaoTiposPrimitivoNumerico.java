package fundamentos;

public class ConversaoTiposPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double d = 1; //Conversão implicita
		System.out.println(d);
		
		float f = (float)1.1234567888888; //Conversão explicita (CAST)
		System.out.println(f);
		
		int i = 340;
		byte b = (byte) i;
		System.out.println(b); //Conversão explicita (CAST)
		
		double dou = 1.999999;
		int in = (int) dou; //Conversão explicita (CAST)
		System.out.println(in);
	}

}
