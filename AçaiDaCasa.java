package vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class AçaiDaCasa {

	public static void main(String[] args) {
		
		int escolha, escolha2;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList <String> ingredientes = new ArrayList<String>();
		
		ingredientes.add("Confete");
		ingredientes.add("Leite Condensado");
		ingredientes.add("Mix de Frutas");
		ingredientes.add("Ovomaltine");
		ingredientes.add("Granulado");
		ingredientes.add("Leite em pó");
		ingredientes.add("Paçoca");
		
		
		System.out.println("Bem vindo ao Açaí da Casa, aqui está uma lista dos ingredientes que irão ser adicionados em seu Açaí");
		System.out.println(ingredientes);
		System.out.println("Caso deseje tirar algum ingrediente de seu Açaí, digite um número correspondente ao ingrediente mostrado na lista, caso o contrário, digite qualquer número que não seja de 1 a 7");
		escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
			ingredientes.remove(0);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 2:
			ingredientes.remove(1);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 3:
			ingredientes.remove(2);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 4:
			ingredientes.remove(3);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 5:
			ingredientes.remove(4);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 6:
			ingredientes.remove(5);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
		case 7:
			ingredientes.remove(6);
			System.out.println("O seu Açaí virá com os seguintes ingredientes: " + ingredientes);
			break;
			
		default:
			System.out.println("O seu Açaí então, virá com os seguintes ingredientes: " + ingredientes);
			
		}
		
		
	    
		
		

	}

}
