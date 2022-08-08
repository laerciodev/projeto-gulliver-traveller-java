package br.masters3.beans;
import java.util.Date;

public class CNH {
	
	private int numero;
	private char categoria;
	private Date dataDeEmissao;
	private Date dataDeValidade;
	
	public CNH() {
		super();
	}
	
	public CNH(int numero, char categoria, Date dataDeEmissao, Date dataDeValidade) {
		super();
		this.numero = numero;
		this.categoria = categoria;
		this.dataDeEmissao = dataDeEmissao;
		this.dataDeValidade = dataDeValidade;
	}

	public int imprimeNumero() {
		return numero;
	}
	
	public void alteraNumero(int numero) {
		this.numero = numero;
	}
	
	public char imprimeCategoria() {
		return categoria;
	}
	
	public void alteraCategoria(char categoria) {
		this.categoria = categoria;
	}
	
	public Date imprimeDataDeEmissao() {
		return dataDeEmissao;
	}
	
	public void alteraDataDeEmissao(Date dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	
	public Date imprimeDataDeValidade() {
		return dataDeValidade;
	}
	
	public void alteraDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
		
}
