package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

public class UC06CadastrarLivro {
	static private Livro livro;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//cenario
			livro = new Livro();
			livro.setIsbn("121212");
			livro.setTitulo("Engenharia de Software");
			livro.setAutor("Pressman");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_Verificar_o_metodo_getIsbn() {
		assertEquals("121212", livro.getIsbn());
	}
	
	
	@Test(expected=RuntimeException.class)
	public void CT07() {
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT08() {
		livro.setIsbn(null);
	}
	

}
