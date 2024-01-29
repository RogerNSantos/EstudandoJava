package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();//Lista não ordenada Homogenea
		SortedSet<String> listaAprovados = new TreeSet<>();// Lista ordenada Homogenea
		listaAprovados.add("Ana");
		listaAprovados.add("Rogério");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> numeros = new HashSet<>();
		numeros.add(2);
		numeros.add(10);
		numeros.add(150);
		numeros.add(1);

		for (int n: numeros) {
			System.out.println(n);
		}
		
	}

}
