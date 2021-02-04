package Exercicios;

public class Cliente {
	
	private String nomeCliente;
	private int idadeCliente;
	private String emailCliente;
	private int telefoneCliente;
	
    public Cliente (String nomeCliente, int idadeCliente, String emailCliente, int telefoneCliente) {
		
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.emailCliente = emailCliente;
		this.telefoneCliente = telefoneCliente;
    }
    
    public void imprimirInfo() {
    	
    	System.out.println("Cliente: "+nomeCliente+"\n Idade: "+idadeCliente+"\nE-mail: "+emailCliente+"\nTelefone: "+telefoneCliente);
    	
    }

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdadeCliente() {
		return idadeCliente;
	}

	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public int getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(int telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
    
    
		
	}
	
	


