package ExercicioUM;

import java.util.Scanner;

public class ExercicioTRES {
	
	public static void main (String ARGS[])
	
	{
		
		int segundos, horas, minutos, segundostotais;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com os segundos totais do tempo de fabricação: ");
		segundostotais = leia.nextInt();
		
		horas = segundostotais/3600;
		minutos = (segundostotais-(horas*3600))/60;
		segundos = segundostotais - ((horas*3600)+(minutos*60));
		
		System.out.println("O tempo da sua fabricação é de "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		
	}

}
