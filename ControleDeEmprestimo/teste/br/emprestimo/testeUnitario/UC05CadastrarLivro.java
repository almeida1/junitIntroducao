package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC05CadastrarLivro {
	static Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//cenario
				livro = new Livro();
				//acao
				livro.setAutor("Pressman");
				livro.setIsbn("121212");
				livro.setTitulo("Engenharia de Software");
				//verificacao
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC05CadastraLivro_com_sucesso(){
		assertEquals("121212",livro.getIsbn());
	}
	
	@Test(expected=RuntimeException.class)
	public void CT01UC05CadastraLivro_com_isbn_invalido(){
		livro.setIsbn(null);
	}


}
