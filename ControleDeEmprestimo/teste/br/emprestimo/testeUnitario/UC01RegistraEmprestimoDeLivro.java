package br.emprestimo.testeUnitario;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;
import br.emprestimo.servico.ServicoEmprestimo;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class UC01RegistraEmprestimoDeLivro {
	static private Livro livro;
	static private Usuario usuario;
	static private ServicoEmprestimo servico;
	static private Emprestimo emprestimo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//cenario
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
		servico = new ServicoEmprestimo();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void CT01UC01FB_registrar_emprestimo_com_sucesso() {
		assertNotNull(servico.empresta(livro, usuario));
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC01FB_registrar_emprestimo_com_dados_invalidos() {
		servico.empresta(null, usuario);
	}
	@Test
	public void CT03UC01FB_registrar_emprestimo_com_dados_invalidos(){
		try{
			servico.empresta(null, usuario);
			fail ("deveria lan�ar uma exce��o");
		}catch(RuntimeException e){
			assertEquals("Dados inv�lidos.", e.getMessage());
		}
	}
	
	@Test
	public void CT05Verificar_o_metodo_getIsbn() {
		assertEquals("121212", livro.getIsbn());
	}
	@Test
	public void CT06Verificar_o_metodo_getIsbn() {
		assertFalse(usuario.equals(null));
	}
	@Test
	public void CT09() {
		Usuario usuario2 = new Usuario();
		usuario2.setNome("silva");
		usuario2.setRa("3333");
		assertFalse(usuario.equals(usuario2));
	}
	@Test(expected=RuntimeException.class)
	public void CT07() {
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT08() {
		livro.setIsbn(null);
	}
	@Test
	public void CT10() {
		Emprestimo umEmprestimo = servico.empresta(livro, usuario);
		assertNotNull(umEmprestimo);
	}
}
