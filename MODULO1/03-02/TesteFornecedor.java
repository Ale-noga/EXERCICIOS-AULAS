package Exercicios;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main (String args[]) {
	
	int x=0, y=0, alterardados;
    Scanner leia = new Scanner(System.in);
	Pessoa pessoa = new Pessoa();
	Fornecedor fornecedor = new Fornecedor();
	do {
	System.out.println("Olá, qual o nome do cliente?");
	pessoa.setNome(leia.nextLine());
	System.out.println("Certo, qual o endereço do: "+pessoa.getNome()+"?");
	pessoa.setEndereco(leia.nextLine());
	System.out.println("Endereço: "+pessoa.getEndereco()+". Qual o Número?");
	pessoa.NumCasa(leia.nextInt());
	System.out.println("Ok! Para finalizar, qual o número de telefone?");
	pessoa.Telefone(leia.nextInt());
	System.out.println("Vamos conferir os dados do: "+pessoa.getNome()+"\n");
	pessoa.InfoPessoa();
	System.out.println("Está correto esses valores?\n1 - SIM | 2 -  NÃO");
	x = leia.nextInt();
	leia.nextLine();
	}while(x != 1);	
	System.out.println("******************************");
	System.out.println("Dados do cliente:");
	pessoa.InfoPessoa();
	System.out.println("******************************");
	System.out.println("Entre com o valor do empréstimo: ");
	fornecedor.setValorcredito(leia.nextDouble());
	System.out.println("Entre com o valor do juros sobre o valor do empréstimo:");
	fornecedor.ValorDivida(leia.nextDouble());
	System.out.println("******************************");
	System.out.println("Informações sobre o empréstimo:");
	fornecedor.InfoEmprestimo();
	System.out.println("\n******************************\n");
	do{System.out.println("Já houve algum pagamento?\n1 - SIM | 2- NÃO");
	x = leia.nextInt();
	if(x==1) {
		System.out.println("Qual valor?");
		fornecedor.ObterSaldo(leia.nextDouble());
		System.out.println("ATUALIZAÇÃO:");
		fornecedor.InfoEmprestimoPagamento();
		x=2;}
	else if (x>2) {
		System.out.println("Opção inválida!");
	}
	}while(x!=2);
	System.out.println("Até o próximo empréstimo!");
 }
}
