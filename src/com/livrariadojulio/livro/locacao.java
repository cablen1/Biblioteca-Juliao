package com.livrariadojulio.livro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class locacao {

	private List<Livro> livros;
	private Cliente cliente;
	private LocalDateTime data;
	private Devolucao devolucao;
	public BigDecimal juros;
	
	
	public locacao(List<Livro> livros, Cliente cliente) {
		this.livros = livros;
		this.cliente = cliente;
		this.data = LocalDateTime.now();
		this.gerarDevolucao();
	}
	private void gerarDevolucao() {
		this.devolucao = new Devolucao(LocalDateTime.of(CalcularDataPrevista(), LocalTime.of(19, 0)));
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Devolucao getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Devolucao devolucao) {
		this.devolucao = devolucao;
	}

	public LocalDate CalcularDataPrevista() {
		return this.data.plusDays(this.livros.size()).toLocalDate();
	}

	public void imprimirRecibo() {
		System.out.println("Obrigado \n" + this.cliente.getNome());
		System.out.println("Livro(s):");

		BigDecimal total = BigDecimal.ZERO;
		for (Livro livro : this.getLivros()) {
			System.out.println(livro.getNome());
			total = total.add(livro.getValor());
			BigDecimal juros = new BigDecimal("0.01");
			BigDecimal jurosVintePorCento = new BigDecimal("0.02");
			System.out.println("Taxa de juros por atraso (10%) após a data limite: "+ juros.multiply(total));
			System.out.println("Taxa de juros por atraso (20%) após a data limite: "+ jurosVintePorCento.multiply(total));	
			
				
		}
		System.out.printf("Valor total R$ %s \n", total);
		System.out.printf("Data devolução: %s",this.getDevolucao().getDataPrevista().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

	}
}
