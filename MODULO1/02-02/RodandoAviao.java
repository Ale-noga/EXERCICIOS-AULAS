package Exercicios;

import java.util.Scanner;

public class RodandoAviao {
	
	public static void main (String args []) {
		
		String modelo = null, companhia = null;
		int anofabri = 0, capacidade = 0;
		Scanner leia = new Scanner (System.in);
				
		System.out.println("Quantos avi�es voc� gostaria de cadastrar?");
		int N = leia.nextInt();
				
		Aviao[] objAviao = new Aviao [N];
		
		for (int x=0;x<N;x++) {
			
			System.out.println("Qual companhia?");
			companhia = leia.next();
			System.out.println("Qual modelo?");
			modelo = leia.next();
			System.out.println("Qual � o ano de fabrica��o?");
			anofabri = leia.nextInt();
			System.out.println("Qual capacidade do avi�o?");
			capacidade = leia.nextInt();
			
			objAviao[x] = new Aviao (companhia,modelo,anofabri,capacidade);
								
		}				
		
		for (int x=0;x<N;x++) {
			
			objAviao[x].infoaviao();
			System.out.println("------------------------");
		}
		
		
	}

}
