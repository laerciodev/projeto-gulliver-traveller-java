package br.masters3.beans;
import java.util.Date;

public class Motorista {

	private String nome;
	private int totalDeViagens;
	private int nota;
	private Date DataDeAdmissao;
		
	public Motorista() {
		super();
	}

	public Motorista(String nome, int totalDeViagens, int nota, Date dataDeAdmissao) {
		super();
		this.nome = nome;
		this.totalDeViagens = totalDeViagens;
		this.nota = nota;
		DataDeAdmissao = dataDeAdmissao;
	}

	public String imprimeNome() {
		return nome;
	}
	
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	
	public int imprimeTotalDeViagens() {
		return totalDeViagens;
	}
	
	public void alteraTotalDeViagens(int totalDeViagens) {
		this.totalDeViagens = totalDeViagens;
	}
	
	public int imprimeNota() {
		return nota;
	}
	
	public void alteraNota(int nota) {
		this.nota = nota;
	}
	
	public Date imprimeDataDeAdmissao() {
		return DataDeAdmissao;
	}
	
	public void alteraDataDeAdmissao(Date dataDeAdmissao) {
		DataDeAdmissao = dataDeAdmissao;
	}
}
