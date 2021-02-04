package ExercicioUM;

import java.util.Scanner;

class ExercicioCINCO {
	
	public static void main (String args[])
	{
		
		double n1, n2, n3, media;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1*0.2)+(n2*0.3)+(n3*0.5));
		
		System.out.printf("A média do aluno é: "+media);
		
		
		
	}

}
