package ExercicioUM;

import java.util.Scanner;

public class LANCAMENTODEDADOS {
	
	public static void main (String args []) {
		
		int d=10, x, c=0, soma=0, media=0, vet[] = new int [d]; 
		Scanner leia = new Scanner (System.in);
		
		for (x=0;x<10;x++) {
			
			System.out.println("Digite os valores correspondentes aos lan�amentos do dado:");
			vet[x]=leia.nextInt();
						
		}
		
		int maior = vet[0];
		
		for (x=0;x<10;x++) {
			
			soma= soma+vet[x];
			media=soma/10;
			if (vet[x]>maior) {
				
				maior=vet[x];
				c++;
							
			}
		}
		
		for (x=0;x<10;x++) {
			
			if (vet[x]==maior) {
				
				System.out.printf("\n Vet[%d] = %2d -----> MAIOR NOTA", x, vet[x]);
				
			}
			
			else {
				
				System.out.printf("\n Vet[%d] = %2d", x, vet[x]);
			}
			
		}
		
		System.out.printf("\n Soma dos valores lan�ados: %2d e m�dia final: %2d", soma, media);
		System.out.printf("\n Vezes que o maior n�mero foi ultrapassado: %2d", c);
		
	}

}
