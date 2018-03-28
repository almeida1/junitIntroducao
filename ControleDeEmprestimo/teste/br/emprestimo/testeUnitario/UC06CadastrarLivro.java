package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.dadosDeTeste.ObtemLivro;
import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC06CadastrarLivro {
	static private Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//cenario
//			livro = new Livro();
//			livro.setIsbn("121212");
//			livro.setTitulo("Engenharia de Software");
//			livro.setAutor("Pressman");
			livro = ObtemLivro.comDadosValidos();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_isbn_valido() {
		assertEquals("121212", livro.getIsbn());
	}
	
	@Test
	public void CT02UC06CadastrarLivro_titulo_valido() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}
	@Test
	public void CT03UC06CadastrarLivro_autor_valido() {
		assertEquals("Pressman", livro.getAutor());
	}
	@Test(expected=IllegalArgumentException.class)
	public void CT04UC06CadastrarLivro_isbn_invalido_branco() {
		livro.setIsbn("");
	}
	
	@Test(expected=RuntimeException.class)
	public void CT05UC06CadastrarLivro_isbn_invalido_nulo() {
		livro.setIsbn(null);
	}
	@Test(expected=IllegalArgumentException.class)
	public void CT06UC06CadastrarLivro_isbn_invalido_branco() {
		ObtemLivro.comISBNInvalido_branco();
	}
	@Test(expected=IllegalArgumentException.class)
	public void CT07UC06CadastrarLivro_isbn_nulo() {
		ObtemLivro.comISBNInvalido_nulo();
	}

}
