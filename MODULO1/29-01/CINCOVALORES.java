package ExercicioUM;

import java.util.Scanner;

public class CINCOVALORES {
	
	public static void main (String args []) {
		
		int i, x=5, vet[] = new int [x];
		
		Scanner leia = new Scanner (System.in);
		
		for (i=0;i<5;i++) {
			
			System.out.println("Entre com a nota: ");
			vet[i] = leia.nextInt();
		}		
		int maior=vet[0];
		
		for (i=0;i<5;i++) {
		
			if (vet[i]>maior) {
				
				maior = vet[i];
			}
		}
		
		for (i=0;i<5;i++) {
			
			if (vet[i]==maior) {
				System.out.printf("\nVet[%d] = %2d -----> MAIOR NOTA.", i, vet[i]);
			}
			else {
			
				System.out.printf("\nVet[%d] = %2d", i, vet[i]);
			}
			
		}
		
		
		
	}

}
