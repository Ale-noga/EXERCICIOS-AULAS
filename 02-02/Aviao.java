package Exercicios;

public class Aviao {
	
	private String nomeCompanhia;
	private String modelo;
	private int anofabri;
	private int capacidade;
	
	public Aviao (String nomeCompanhia, String modelo, int anofabri, int capacidade) {
		
		this.nomeCompanhia = nomeCompanhia;
		this.modelo = modelo;
		this.anofabri = anofabri;
		this.capacidade = capacidade;		
			
	}		
	public void infoaviao() {
			System.out.println("Companhia: "+nomeCompanhia+"\nModelo: "+modelo+"\nAno de Fabricação:"+anofabri+"\nCapacidade:"+capacidade);
	}


	public String getNomeCompanhia() {
		return nomeCompanhia;
	}


	public void setNomeCompanhia(String nomeCompanhia) {
		this.nomeCompanhia = nomeCompanhia;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnofabri() {
		return anofabri;
	}


	public void setAnofabri(int anofabri) {
		this.anofabri = anofabri;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
	
	

}
