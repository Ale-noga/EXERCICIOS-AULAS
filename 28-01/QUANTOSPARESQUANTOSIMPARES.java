package ExercicioUM;

import java.util.Scanner;

public class QUANTOSPARESQUANTOSIMPARES {
	
	public static void main (String args []) {
		
		int num, x, par=0, impar=0;
		Scanner leia = new Scanner (System.in);
		
		for (x=0;x<10;x++) {
			
		System.out.println("Entre com o n�mero: ");
		num = leia.nextInt();
		
		if (num%2==0) {
			par++;
			
		}
		
		if (num%2!=0) {
			impar++;
			
		}
		
		}
		
		System.out.println("Quantidade de n�meros pares: "+par);
		System.out.println("Quantidade de n�meros �mpares: "+impar);
	}

}
