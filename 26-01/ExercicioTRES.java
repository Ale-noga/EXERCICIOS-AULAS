package ExercicioUM;

import java.util.Scanner;

public class ExercicioTRES {
	
	public static void main (String ARGS[])
	
	{
		
		int segundos, horas, minutos, segundostotais;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com os segundos totais do tempo de fabrica��o: ");
		segundostotais = leia.nextInt();
		
		horas = segundostotais/3600;
		minutos = (segundostotais-(horas*3600))/60;
		segundos = segundostotais - ((horas*3600)+(minutos*60));
		
		System.out.println("O tempo da sua fabrica��o � de "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
		
	}

}
