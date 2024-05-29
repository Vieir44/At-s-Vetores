package vetor;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		
		numeros.add(14);
		numeros.add(27);
		numeros.add(32);
		numeros.add(9);
		numeros.add(7);
		
		for(Integer num: numeros) {
			soma += num;
			System.out.println("Números: " + num);
		}
		
		
		
		
		System.out.println(soma);
		
		
		
		
		
		

	}

}
