package com.livrariadojulio.exemplo;

import java.util.Arrays;
import java.util.List;

import com.livrariadojulio.livro.Cliente;
import com.livrariadojulio.livro.Livro;
import com.livrariadojulio.livro.locacao;
import com.livrariadojulio.repository.Livros;

public class NovaLocacao {

	public static void main(String[] args) {
		Livros livros = new Livros();
		List<Livro> livrosAlugados = Arrays.asList(livros.porCodigo(2));
		locacao locacao = new locacao(livrosAlugados, new Cliente("julio sartori"));

		locacao.imprimirRecibo();
	

	}
}
