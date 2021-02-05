package Exercicios;

import java.util.Scanner;

public class TesteEstoque {
		
	public static void main (String args[]) throws InterruptedException{
			
	Scanner leia = new Scanner (System.in);
	Estoque est = new Estoque();
	int x=0; int y=1;
	new Thread();
	
	System.out.println("\t*BEM-VINDO AO SIS*");
	System.out.println("******************************");
	Thread.sleep(1000);
	est.Bancodeestoque();
	est.Bancodeprodutos();
	do { 
	System.out.println("MENU PRINCIPAL:\n\n1 - ADICIONAR NOVO PRODUTO | 2 - ATUALIZAR PRODUTO "
			+ "| 3 - REMOVER PRODUTO | 4 - APRESENTAR OS PRODUTOS | 9 - SAIR");
	System.out.print("Digite:");
	x = leia.nextInt();
	switch(x) {
	
	case 1: System.out.println("Qual produto quer adicionar?");
	leia.nextLine();
	est.adicionarprodutos(leia.nextLine());
	System.out.println("Quantidade de estoque?");
	est.adicionarestoque(leia.nextInt());break;
	
	case 2:System.out.println("Qual produto quer atualizar?");
	leia.nextLine();est.alterarprodutos(leia.nextLine());break;
	
	case 3:System.out.println("Qual produto quer remover?");
	leia.nextLine();
	est.removerproduto(leia.nextLine());break;
	case 4:System.out.println("************************");
	est.imprimirprodutoestoque();y=0;break;
	case 9:System.out.println("Até a próxima!");
	default:System.out.println("Opção inválida!");break;
	}}while (y!=0);
	
	
	}
}
