package ExercicioUM;

import java.util.Scanner;

public class ExercicioUM1 {
	
	public static void main (String args[])
	
	{
	
	int anos, meses, dias, totaldias;
	
	Scanner leia = new Scanner (System.in);
	
	System.out.println("Entre com sua idade apenas em anos: ");
	anos = leia.nextInt();
	
	System.out.println("Entre com sua idade apenas em meses: ");
	meses = leia.nextInt();
	
	System.out.println("Alguns dias restantes? ");
	dias = leia.nextInt();
	
	totaldias = (anos*360) + (meses*30) + dias;
			
			System.out.println("O total de dias de sua idade é: "+totaldias);
	
	
	}

}
