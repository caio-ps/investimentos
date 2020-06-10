package br.com.itau.investimentos.dto;

public class InvestimentoDTO {

	private double valor;
	private int quantidadeMeses;
	private double montante;

	public InvestimentoDTO() {
	}
	
	public InvestimentoDTO(double valor, int quantidadeMeses, double montante) {
		super();
		this.valor = valor;
		this.quantidadeMeses = quantidadeMeses;
		this.montante = montante;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeMeses() {
		return quantidadeMeses;
	}

	public void setQuantidadeMeses(int quantidadeMeses) {
		this.quantidadeMeses = quantidadeMeses;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

}
