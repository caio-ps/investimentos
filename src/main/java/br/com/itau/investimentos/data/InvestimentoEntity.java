package br.com.itau.investimentos.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvestimentoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double valor;
	private int quantidadeMeses;
	private double montante;

	public InvestimentoEntity() {
	}
	
	public InvestimentoEntity(double valor, int quantidadeMeses, double montante) {
		super();
		this.valor = valor;
		this.quantidadeMeses = quantidadeMeses;
		this.montante = montante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
