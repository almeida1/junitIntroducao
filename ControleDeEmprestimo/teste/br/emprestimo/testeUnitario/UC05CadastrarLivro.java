package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import br.emprestimo.modelo.Livro;

public class UC05CadastrarLivro {
	static Livro livro;
	@Rule
    public ExpectedException thrown = ExpectedException.none();

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
		livro.setIsbn("121212");
		assertEquals("121212",livro.getIsbn());
	}
	
	@Test(expected=RuntimeException.class)
	public void CT02UC05CadastraLivro_com_isbn_invalido_null(){
		livro.setIsbn(null);
	}
	
	@Test(expected=RuntimeException.class)
	public void CT03UC05CadastraLivro_com_isbn_invalido_branco(){
		livro.setIsbn("");
	}
	
	
	@Test
	public void CT04UC05CadastraLivro_com_isbn_invalido(){
		try{
		livro.setIsbn(null);
		fail ("deveria lançar uma exceção");
		}catch(RuntimeException e){
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
}
