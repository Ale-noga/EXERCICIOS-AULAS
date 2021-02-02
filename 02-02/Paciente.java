package Exercicios;

public class Paciente {

	private String Nome;
	private String TipoSangue;
	private String Queixa;
	private int AnoNasc;
	
	public Paciente(String Nome,String Sangue,String Queixa,int AnoNasc) {
		this.Nome = Nome;
		this.TipoSangue = Sangue;
		this.Queixa = Queixa;
		this.AnoNasc =  AnoNasc;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Paciente: "+Nome+" - Possui o tipo sanguíneo: "+TipoSangue+" - Com os sintomas: "+Queixa+" - Idade: "+AnoNasc+" anos");
	}
	
	public void idade(int idade)
	{
		AnoNasc = 2021 - idade;
		
	}	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTipoSangue() {
		return TipoSangue;
	}

	public void setTipoSangue(String tipoSangue) {
		TipoSangue = tipoSangue;
	}

	public String getQueixa() {
		return Queixa;
	}

	public void setQueixa(String queixa) {
		Queixa = queixa;
	}

	public int getAnoNasc() {
		return AnoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		AnoNasc = anoNasc;
	}
	
	
}
