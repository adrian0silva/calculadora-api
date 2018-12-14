package br.com.db1start.calculadoraapi.dto;

import br.com.db1start.calculadoraapi.model.Operacao;

public class CalculadoraDTO {
	
	private Operacao operacao;
	
	private double numeroUm;
	
	private double numeroDois;

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Double getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(Double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public Double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(Double numeroDois) {
		this.numeroDois = numeroDois;
	}
	
	
	
}
