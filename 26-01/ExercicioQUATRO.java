package ExercicioUM;

import java.util.Scanner;

public class ExercicioQUATRO {
	
	public static void main (String args[])
	
	{
		
		float A, B, C, R, S;
		double pot1, pot2, D;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o primeiro n�mero: ");
		A = leia.nextFloat();
		
		System.out.println("Insira o segundo n�mero: ");
		B = leia.nextFloat();
		
		System.out.println("Insira o terceiro n�mero: ");
		C = leia.nextFloat();
		
		/*D = ((A+B)� + (B+C)�) / 2*/
		
		
		R = A + B;
		pot1 = Math.pow(R, 2);
		S = B + C;
		pot2 = Math.pow(S, 2);
		D = (pot1 + pot2)/2;
		
		System.out.printf("O resultado da opera��o: "+D);	
				
	}

}
