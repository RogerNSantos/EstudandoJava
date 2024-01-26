package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAluno1 = new double[4];

		notasAluno1[0] = 7.9;
		notasAluno1[1] = 8;
		notasAluno1[2] = 6.7;
		notasAluno1[3] = 9.7;

		System.out.println(Arrays.toString(notasAluno1));
		System.out.println(notasAluno1[3]);

		System.out.println(notasAluno1[notasAluno1.length - 1]);

		double total = 0;
		for (int i = 0; i < notasAluno1.length; i++) {
			total += notasAluno1[i];
		}

		System.out.println(total / notasAluno1.length);
		
		double [] notasAluno2 = {6.9, 8.9, 5.9, 10};
		
		double totalnotasAluno2 = 0;
		for (int i = 0; i < notasAluno2.length; i++ ) {
			totalnotasAluno2 += notasAluno2[i];
		}
		
		System.out.println(totalnotasAluno2 / notasAluno2.length);
		
	}

}
