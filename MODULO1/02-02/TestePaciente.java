package Exercicios;

import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		Scanner leia = new Scanner (System.in);
		
		while(x>=0 && x<3) {
			System.out.println("Digite seu nome");
			String nome = leia.next();
			System.out.println("Digite seu tipo sanguíneo");
			String sangue = leia.next();
			System.out.println("Digite sua queixa");
			String queixa = leia.next();
			System.out.println("Digite seu ano de nascimento");
			int AnoNasc = leia.nextInt();
			Paciente paciente1 = new Paciente(nome,sangue,queixa,AnoNasc);
			paciente1.idade(AnoNasc);
			paciente1.imprimirInfo();
			x++;
		}

	}

}
