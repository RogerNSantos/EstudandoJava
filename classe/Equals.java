 package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Rogério Santos";
		u1.email = "Santos@gmail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Rogério Santos";
		u2.email = "Santos@gmail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
		
	}

}
