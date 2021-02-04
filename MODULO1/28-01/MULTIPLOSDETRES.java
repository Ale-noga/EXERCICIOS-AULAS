package ExercicioUM;

import java.util.Scanner;

public class MULTIPLOSDETRES {
	
	public static void main (String args[]) {
		
		int num, x=0, somanum=0;
		float media = 0;
		Scanner leia = new Scanner (System.in);
		
		do { 
			
		System.out.println("Escreva o número");
		num = leia.nextInt();
		
		System.out.println("Para sair digite 0");
		
		if (num%3==0 && num!=0) {
			
			x++;
			somanum = somanum + num;
			media = somanum/x;
		}
		
		} while (num !=0);
		
		System.out.printf("A media da soma dos múltiplos de 3 foi: "+ media);
		
	}

}
