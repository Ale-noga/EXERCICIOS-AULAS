package ExercicioUM;

import java.util.Scanner;

public class ExercicioDOIS {
	
	public static void main (String args[])
	{
		
		int idadeanos, idademeses, diasanos, idadedias;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com sua idade em total de dias: ");
		diasanos = leia.nextInt();
		
		idadeanos = diasanos/360;
		idademeses = (diasanos-(idadeanos*360))/30;
		idadedias = diasanos-((idadeanos*360)+(idademeses*30));
		
		System.out.println("Você tem "+idadeanos+" anos, "+idademeses+" meses e "+idadedias+" dias.");
		
				
	}
	

}
