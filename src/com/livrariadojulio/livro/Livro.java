package com.livrariadojulio.livro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Livro {

	private String nome;
	private LocalDate dataLan�amento;
	private BigDecimal valor;

	public Livro(String nome, LocalDate dataLan�amento, BigDecimal valor) {
		super();
		this.nome = nome;
		this.dataLan�amento = dataLan�amento;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLan�amento() {
		return dataLan�amento;
	}

	public void setDataLan�amento(LocalDate dataLan�amento) {
		this.dataLan�amento = dataLan�amento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
