package vetor;

import java.util.ArrayList;

public class SomaNegativo {

	public static void main(String[] args) {

		int soma = 0;



		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(-44);
		numeros.add(27);
		numeros.add(-35);
		numeros.add(22);
		numeros.add(-56);

		for (int i : numeros) {


			if (i < 0) {
				soma = soma+i; 


			}

		
		}
		System.out.println("O resultado da soma é igual a: " +soma);
	}
}
