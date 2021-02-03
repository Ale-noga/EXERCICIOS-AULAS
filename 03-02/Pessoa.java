package Exercicios;

import java.text.NumberFormat;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String numcasa;
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome, String endereco, String telefone, String numcasa) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.numcasa = numcasa;
	}
	
	public void Telefone (int tel) {
		String Telefone = Integer.toString(tel);
		telefone = Telefone;
	}
	public void NumCasa (int num) {
		String NumCasa = Integer.toString(num);
		numcasa = NumCasa;
	}
	
	public String formataMoeda(double valor) {
	NumberFormat nf = NumberFormat.getCurrencyInstance();
	nf.setMinimumFractionDigits(2);
	return nf.format(valor);
	}
	
	public void InfoPessoa() {
		System.out.println("Nome: "+nome+"\nEndereço: "+endereco+"\nNº: "+numcasa+"\nTelefone: "+telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNumcasa() {
		return numcasa;
	}

	public void setNumcasa(String numcasa) {
		this.numcasa = numcasa;
	}
	
}
