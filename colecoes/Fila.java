package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// OFFER E ADD -> ADICIONAM ELEMENTOS NA FILA

		// DIFERENÇA É O COMPORTAMENTO OCORRE QUANDO A FILA ESTÁ CHEIA!
		fila.add("Ana");
		fila.add("Bia");
		fila.add("Carlos");
		fila.add("Daniel");
		fila.add("Rafael");
		fila.add("Gui");

		// PEEK E ELEMENT -> OBTER O PRÓXIMO ELEMENTOS DA
		// FILA (sem remover)

		// DIFERENTE É O COMPORTAMENTO OCORRE QUANDO A FILA ESTÁ VAZIA!
		System.out.println(fila.peek());// RETORNA NULL
		System.out.println(fila.peek());
		System.out.println(fila.element());// LANÇA UMA EXEÇÃO
		System.out.println(fila.element());

		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		// fila.size
		// file.clear - Para limpar a fila
		// file.isEmpty - Para saber se está ou não fazia

	}

}
