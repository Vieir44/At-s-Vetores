package vetor;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		
		System.out.println(numeros.get(0)); //Saída: 10 // Acessando elementos do ArrayList
		System.out.println(numeros.get(1)); //Saída: 20
		
		numeros.set(1, 25);
		System.out.println(numeros.get(1)); //Saída: 25 // Modificando elementos do ArrayList
		
		numeros.remove(0);
		System.out.println(numeros.get(0)); //Saída: 25 // Removendo os elementos do ArrayList
		
		System.out.println(numeros.size());
		

	}

}
