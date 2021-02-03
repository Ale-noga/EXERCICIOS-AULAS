package Exercicios;

public class Fornecedor extends Pessoa{
	
	private double valorcredito;
	private double valordivida;
	private double saldo;
	
	public Fornecedor () {
		
	}
	public Fornecedor (String nome, String endereco, String telefone, String numcasa) {
		
		super(nome, endereco, telefone, numcasa);
			
	}
	
	public Fornecedor (String nome, String endereco, String telefone, String numcasa, double valorcredito, double valordivida, double saldo) {
		
		super(nome, endereco, telefone, numcasa);
		this.valorcredito = valorcredito;
		this.valordivida = valordivida;
		this.saldo = saldo;
	}
	
	public void ValorCredito (double valor) {
		valorcredito = valor;
	}
	public void ValorDivida (double juros) {
		valordivida = (valorcredito+(valorcredito*(juros/100)));
	}
	public void ObterSaldo (double valor) {
		valordivida = valordivida - valor;
		saldo = valorcredito - valordivida;
		
	}
	public void InfoEmprestimo() {
		System.out.println("Emprestimo no valor de: "+this.formataMoeda(valorcredito)+
				"\nRestando para quitação: "+this.formataMoeda(valordivida));
	}
	public void Pagamento (double valor) {
		valordivida = valordivida - valor;
	}
	public void InfoEmprestimoPagamento() {
		System.out.println("Emprestimo no valor de: "+this.formataMoeda(valorcredito)+
				"\nRestando para quitação: "+this.formataMoeda(valordivida)+"\nSaldo (Emprestimo - Divida): "+this.formataMoeda(saldo));
	}

	public double getValorcredito() {
		return valorcredito;
	}

	public void setValorcredito(double valorcredito) {
		this.valorcredito = valorcredito;
	}

	public double getValordivida() {
		return valordivida;
	}

	public void setValordivida(double valordivida) {
		this.valordivida = valordivida;
	}
	
	
	
}
