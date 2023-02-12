package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;


public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento)
	{
		// Regra de negócio (1): 5 itens  = desconto de 10%
		if (orcamento.getQuantidadeItens() > 5)
		{
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		//Regra de negócio (2): além da quantidade de itens, o valor do orçamento influencia no desconto
		if(orcamento.getValor().compareTo(new BigDecimal("500"))>0)
		{
			return orcamento.getValor().multiply(new BigDecimal("0.1"));

		}
		
		return BigDecimal.ZERO;
	}
	
}
