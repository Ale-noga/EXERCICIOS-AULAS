package Exercicios;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main (String args[]) {
	
	int x=0, y=0, alterardados;
    Scanner leia = new Scanner(System.in);
	Pessoa pessoa = new Pessoa();
	Fornecedor fornecedor = new Fornecedor();
	do {
	System.out.println("Ol�, qual o nome do cliente?");
	pessoa.setNome(leia.nextLine());
	System.out.println("Certo, qual o endere�o do: "+pessoa.getNome()+"?");
	pessoa.setEndereco(leia.nextLine());
	System.out.println("Endere�o: "+pessoa.getEndereco()+". Qual o N�mero?");
	pessoa.NumCasa(leia.nextInt());
	System.out.println("Ok! Para finalizar, qual o n�mero de telefone?");
	pessoa.Telefone(leia.nextInt());
	System.out.println("Vamos conferir os dados do: "+pessoa.getNome()+"\n");
	pessoa.InfoPessoa();
	System.out.println("Est� correto esses valores?\n1 - SIM | 2 -  N�O");
	x = leia.nextInt();
	leia.nextLine();
	}while(x != 1);	
	System.out.println("******************************");
	System.out.println("Dados do cliente:");
	pessoa.InfoPessoa();
	System.out.println("******************************");
	System.out.println("Entre com o valor do empr�stimo: ");
	fornecedor.setValorcredito(leia.nextDouble());
	System.out.println("Entre com o valor do juros sobre o valor do empr�stimo:");
	fornecedor.ValorDivida(leia.nextDouble());
	System.out.println("******************************");
	System.out.println("Informa��es sobre o empr�stimo:");
	fornecedor.InfoEmprestimo();
	System.out.println("\n******************************\n");
	do{System.out.println("J� houve algum pagamento?\n1 - SIM | 2- N�O");
	x = leia.nextInt();
	if(x==1) {
		System.out.println("Qual valor?");
		fornecedor.ObterSaldo(leia.nextDouble());
		System.out.println("ATUALIZA��O:");
		fornecedor.InfoEmprestimoPagamento();
		x=2;}
	else if (x>2) {
		System.out.println("Op��o inv�lida!");
	}
	}while(x!=2);
	System.out.println("At� o pr�ximo empr�stimo!");
 }
}
