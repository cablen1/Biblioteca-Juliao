package com.livrariadojulio.exemplo;

import java.time.format.DateTimeFormatter;

import com.livrariadojulio.repository.Livros;

public class ListaTodosLivros {

	public static void main(String[] args) {
		System.out.printf("%-30s %s\n", "nome", "Data de Lançamento:");

		Livros livros = new Livros();
		livros.todos().forEach(l -> {
			System.out.printf("%-30s %s\n", l.getNome(),
					l.getDataLançamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		});

	}

}
