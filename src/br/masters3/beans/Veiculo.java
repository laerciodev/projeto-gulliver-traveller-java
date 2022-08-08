package br.masters3.beans;

public class Veiculo {
	
	private String tipo;
	private String placa;
	private String tipoCombustivel;
	private int quilometragem;
	private int nota;
	private float valorDiaria;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String tipo, String placa, String tipoCombustivel, int quilometragem, int nota, float valorDiaria) {
		super();
		this.tipo = tipo;
		this.placa = placa;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.nota = nota;
		this.valorDiaria = valorDiaria;
	}

	public String imprimeTipo() {
		return tipo;
	}
	
	public void alteraTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String imprimePlaca() {
		return placa;
	}
	
	public void alteraPlaca(String placa) {
		this.placa = placa;
	}
	
	public String imprimeTipoCombustivel() {
		return tipoCombustivel;
	}
	
	public void alteraTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public int imprimeQuilometragem() {
		return quilometragem;
	}
	
	public void alteraQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public int imprimeNota() {
		return nota;
	}
	
	public void alteraNota(int nota) {
		this.nota = nota;
	}
	
	public float imprimeValorDiaria() {
		return valorDiaria;
	}
	
	public void alteraValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
}
