package br.masters3.beans;
import java.util.Date;

public class Cliente {
	private String nome;
	private int cpf;
	private Date dataDeNascimento;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, int cpf, Date dataDeNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String imprimeNome() {
		return nome;
	}
	
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	
	public int imprimeCpf() {
		return cpf;
	}
	
	public void alteraCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public Date imprimeDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void alteraDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}	
	
}
