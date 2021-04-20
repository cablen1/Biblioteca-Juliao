package com.livrariadojulio.livro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Livro {

	private String nome;
	private LocalDate dataLançamento;
	private BigDecimal valor;

	public Livro(String nome, LocalDate dataLançamento, BigDecimal valor) {
		super();
		this.nome = nome;
		this.dataLançamento = dataLançamento;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLançamento() {
		return dataLançamento;
	}

	public void setDataLançamento(LocalDate dataLançamento) {
		this.dataLançamento = dataLançamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
