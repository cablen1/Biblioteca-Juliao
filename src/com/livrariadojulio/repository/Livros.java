package com.livrariadojulio.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Arrays;

import com.livrariadojulio.livro.Livro;

public class Livros {

	private static Livro[] livros = {
		new Livro("American Sniper", LocalDate.of(2017, Month.APRIL, 12), new BigDecimal(15.00)),
		new Livro("The Protector", LocalDate.of(2017, Month.APRIL, 12), new BigDecimal(37.00)),
		new Livro("The Last of US", LocalDate.of(2017, Month.APRIL, 12), new BigDecimal(44.00)),
		};
	
	public List<Livro> todos(){
		return Arrays.asList(livros);
	}

	public Livro porCodigo(int codigo) {
		return livros[codigo];
	}
}
