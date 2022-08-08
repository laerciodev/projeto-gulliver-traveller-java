package br.masters3.beans;
import java.util.Date;

public class Locacao {

	private String locadora;
	private Date dataInicio;
	private Date dataFinal;
		
	public Locacao() {
		super();
	}

	public Locacao(String locadora, Date dataInicio, Date dataFinal) {
		super();
		this.locadora = locadora;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	public String imprimeLocadora() {
		return locadora;
	}
	
	public void alteraLocadora(String locadora) {
		this.locadora = locadora;
	}
	
	public Date imprimeDataInicio() {
		return dataInicio;
	}
	
	public void alteraDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date imprimeDataFinal() {
		return dataFinal;
	}
	
	public void alteraDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
}
