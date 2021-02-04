package ExercicioUM;

import java.util.Scanner;

public class PROGRAMAPSICOLOGICO {
	
	public static void main (String args[]) {
		
		int idade, sexo, opcao, x=0, masc=0, fem=0, outros=0, calma=0, nervo=0, agres=0, z=0, y=0, nervofem=0, mascagres=0, outroscalma=0;
		Scanner leia = new Scanner (System.in);
		
		do {
			x++;
			
			System.out.println("Olá amigx, qual sua idade? ");
			idade = leia.nextInt();	
						
			System.out.println("Olá amigx, qual seu gênero? ");
			System.out.println("1 - MASCULINO // 2 - FEMININO // 3 - OUTROS");
			sexo = leia.nextInt();	
			
			switch (sexo) {
			
			case 1: 
			masc++;
			break;
			
			case 2: 
			fem++;
			break;
				
			case 3: 
			outros++;
			break;
			
			default:
			System.out.println("Opção inválida");	
			
			}
			
			System.out.println("Olá amigx, como você se considera? ");
			System.out.println("1 - CALMA // 2 - NERVOSA // 3 - AGRESSIVA");
			opcao = leia.nextInt();	
			
			switch (opcao) {
			
			case 1: 
			calma++;
			break;
			
			case 2: 
			nervo++;
			break;
			
				
			case 3: 
			agres++;
			break;
			
			default:
			System.out.println("Opção inválida");	
			
			}
			
			if (sexo==2 && opcao ==2) {nervofem++;}
			if (sexo==1 && opcao==3) {mascagres++;}
			if (sexo==3 && opcao==1) {outroscalma++;}
			if (idade>40 && opcao==2) { y++; }
			if (idade<18 && opcao==1) { z++; }
			
		}
			while (x<6); 
		
		
		System.out.println("Número de pessoas calmas: "+calma);
		System.out.println("Número de mulheres nervosas: "+nervofem);
		System.out.println("Número de homens agressivos: "+mascagres);	
		System.out.println("Número de outros calmos: "+outroscalma);		
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+y);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+z);
		
		
		}
		
	}


