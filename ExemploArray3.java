package vetor;

import java.util.ArrayList;
import java.util.Arrays;

public class ExemploArray3 {

	public static void main(String[] args) {
		String[] disciplinas = {"Matemática", "filosofia", "história", "física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Inglês");
		
		for (String i: novaLista)
		{
			System.out.println("Disciplinas: " + i);
		}

	}

}
