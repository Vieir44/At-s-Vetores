package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Carros {

	public static void main(String[] args) {
		
		ArrayList <String> carros = new ArrayList<String>();
		
		int escolha;
		
		Scanner ler = new Scanner(System.in);
		
		carros.add("GTR");
		carros.add("Corvette");
		carros.add("BMW");
		carros.add("Chevrolet");
		carros.add("Porshe");
		carros.add("FUSCÃO PRETO");
		carros.add("Ferrari");
		carros.add("Celta");
		carros.add("Corsa");
		carros.add("Ford");
		
		System.out.println("Aqui está uma lista de carros disponíveis: " + carros);
		
		System.out.println("Agora digite um número de acordo com a posição do carro que você deseja");
		escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("O carro escolhido por você foi o GTR");
			break;
		case 2:
			System.out.println("O carro escolhido por você foi o Corvette");
	        break;
		case 3:
			System.out.println("O carro escolhido por você foi a BMW");
			break;
		case 4:
			System.out.println("O carro escolhido por você foi um Chevrolet");
			break;
		case 5:
			System.out.println("O carro escolhido por você foi um Porshe");
			break;
		case 6:
			System.out.println("O carro escolhido por você foi o LENDÁRIO FUSCÃO PRETO");
			break;
		case 7:
			System.out.println("O carro escolhido por você foi uma Ferrari");
			break;
		case 8:
			System.out.println("O carro escolhido por você foi um Celta");
			break;
		case 9:
			System.out.println("O carro escolhido por você foi o Corsa");
			break;
		case 10:
			System.out.println("O carro escolhido por você foi um Ford");
			break;
			
		default:
			System.out.println("Digite um número de 1 a 10 de acordo com o carro que você deseja");
			
		}
		
		

	}

}
