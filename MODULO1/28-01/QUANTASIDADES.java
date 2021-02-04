package ExercicioUM;

import java.util.Scanner;

public class QUANTASIDADES {
	
	public static void main (String args[]) {
		
		int idade=0, x=0, y=0;
		Scanner leia = new Scanner (System.in);
								
		while(idade!=-99) {
			
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
			
		if (idade<21) {
			x++;
		}
		else if (idade>50) {
			y++;
		}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+x);
		System.out.println("Total de pessoas com mais de 51 anos: "+y);
		
	}

}
