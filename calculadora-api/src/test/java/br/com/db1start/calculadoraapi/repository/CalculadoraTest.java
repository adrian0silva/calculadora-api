package br.com.db1start.calculadoraapi.repository;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1start.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadoraapi.model.Operacao;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarSoma() {
		Calculadora calculadora = new Calculadora(8.0, 2.0);
		
		Double operacaoSoma = calculadora.executaOperacao(Operacao.SOMA);
		
		Assert.assertEquals(10.0, operacaoSoma, 0.0);
	}
	
	@Test
	public void deveRetornaqrSubtracao() {
		Calculadora calculadora = new Calculadora(8.0, 2.0);
		
		Double operacaoSubtrai = calculadora.executaOperacao(Operacao.SUBTRACAO);
		
		Assert.assertEquals(6.0, operacaoSubtrai, 0.0);
	}
	
	@Test
	public void deveRetornarMultiplicacao() {
		Calculadora calculadora = new Calculadora(8.0, 2.0);
		
		Double operacaoMultiplica= calculadora.executaOperacao(Operacao.MULTIPLICACAO);
		
		Assert.assertEquals(16.0, operacaoMultiplica, 0.0);
	}
	
	@Test
	public void deveRetornarDivisao() {
		Calculadora calculadora = new Calculadora(8.0, 2.0);
		
		Double operacaoDivisao = calculadora.executaOperacao(Operacao.DIVISAO);
		
		Assert.assertEquals(4.0, operacaoDivisao, 0.0);
	}
}