package vetor;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int valores, soma= 0;
		int a[]= new int [5];
		Scanner ler = new Scanner(System.in);
		
		for (int i= 0; i<5; i++) {
			System.out.println("Digite 5 valores para serem somados: " + i);
			a [i]= ler.nextInt();
			soma+=a[i];
		}
		
		
		if (soma >= 30) {
			System.out.println("A soma dos números digitados é de igual a: " + soma);
			
		}
		else {
			System.out.println("O valor é menor que 30, o resultado da soma é de: " + soma);
			
			
		}

	}

}
