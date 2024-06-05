package vetor;

import java.util.ArrayList;


public class Frutas {

	public static void main(String[] args) {



		ArrayList <String> frutas = new ArrayList<String>();

		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Pera");
		frutas.add("Uva");
		frutas.add("Abacaxi");
		frutas.add("Manga");
		frutas.add("Mamão");
		frutas.add("Açaí");
		frutas.add("Maracujá");
		frutas.add("Laranja");
		
		System.out.println("Lista de frutas: " + frutas);

		frutas.remove(4);
		frutas.remove(3);
		frutas.remove(2);
		frutas.remove(1);
		frutas.remove(0);

		System.out.println("Agora, uma lista com 5 frutas removidas: " + frutas);

	}

}
