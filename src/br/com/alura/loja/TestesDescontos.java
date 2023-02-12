package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;

import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamentoItens = new Orcamento(new BigDecimal("200"),6);
		Orcamento orcamentoAcimaQuinhentos = new Orcamento(new BigDecimal("600"),2);

		CalculadoraDeDescontos calculadora=  new CalculadoraDeDescontos();
		System.out.println("Desconto de 10% caso for +5 itens:");
	
		System.out.println(calculadora.calcular(orcamentoItens));
		
		System.out.println("Desconto de 10% caso orçamento for acima de R$ 500,00:");

		System.out.println(calculadora.calcular(orcamentoAcimaQuinhentos));


	}

}
