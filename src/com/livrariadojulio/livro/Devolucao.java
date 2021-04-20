package com.livrariadojulio.livro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Devolucao {

	private LocalDateTime dataPrevista;

	public LocalDateTime getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(LocalDateTime dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public LocalDateTime getDataReal() {
		return dataReal;
	}

	public void setDataReal(LocalDateTime dataReal) {
		this.dataReal = dataReal;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Devolucao(LocalDateTime dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	private LocalDateTime dataReal;
	private BigDecimal valor;

}
