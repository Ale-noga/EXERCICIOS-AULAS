package Exercicios;

import java.util.Scanner;

public class CadastroCliente {

	public static void main (String args[]) {
		
		int idade = 0, telefone = 0;
		String nome = null, email = null;
		Scanner leia = new Scanner(System.in);	
						
		System.out.println("Qual seu nome?");
		nome = leia.next();
		System.out.println("Quantos anos você tem??");
		idade = leia.nextInt();
		System.out.println("Qual seu e-mail?");
		email = leia.next();
		System.out.println("Qual seu telefone?");
		telefone = leia.nextInt();
		
		Cliente cliente1 = new Cliente(nome,idade,email,telefone);
		
		cliente1.imprimirInfo();
		
	}
		
}
