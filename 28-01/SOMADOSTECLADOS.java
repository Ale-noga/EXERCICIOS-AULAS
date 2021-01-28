package ExercicioUM;

import java.util.Scanner;

public class SOMADOSTECLADOS {
	
	public static void main (String args[]) {
		
		int x, acm=0;
		Scanner leia = new Scanner (System.in);
		
	do {	
		
		System.out.println("Insira a senha: ");
		x = leia.nextInt();
		
		if (x!=0) {System.out.println("Senha incorreta, tente novamente!");}
		
		acm = acm+x;
		
	} while (x!=0);
	
	
			
			System.out.println("Senha correta!");
			System.out.println("A soma dos números digitados foram: "+acm);
		
	}

}
