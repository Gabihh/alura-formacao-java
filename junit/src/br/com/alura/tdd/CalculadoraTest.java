package br.com.alura.tdd;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class CalculadoraTest {
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSomarComUmNumeroZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 0);
		
		Assert.assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSomarComDoisNumerosZero() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(0, 0);
		
		Assert.assertEquals(0, soma);
	}
	
	@Test
	public void deveriaSomarComUmNumeroNegativo() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, -1);
		
		Assert.assertEquals(2, soma);
	}
	
}
