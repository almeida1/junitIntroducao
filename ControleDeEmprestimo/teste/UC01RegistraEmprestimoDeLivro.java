import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Emprestimo;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;
import br.emprestimo.servico.ServicoEmprestimo;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class UC01RegistraEmprestimoDeLivro {
	
	static private Livro livro;
	static private Usuario usuario;
	static private ServicoEmprestimo servico;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
				
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void CT01UC01FB_registra_emprestimo_com_sucesso() {
		//cenario
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
		ServicoEmprestimo servico = new ServicoEmprestimo();
		Emprestimo emprestimo=null;
		//acao
		emprestimo = servico.empresta(livro, usuario);
		//verifica
		assertNotNull(servico.empresta(livro, usuario).getDataDevolucao());
	}
	@Test
	public void CT02UC01FB_registra_emprestimo_com_sucesso() {
		//cenario
		livro = new Livro();
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
		ServicoEmprestimo servico = new ServicoEmprestimo();
		Emprestimo emprestimo=null;
		
		//acao
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-YYYY");
		String dataEsperada = new DateTime().plusDays(8).toString(fmt);
		emprestimo = servico.empresta(livro, usuario);
		String dataObtida = emprestimo.getDataDevolucao();
		//verificacao
	    assertTrue(dataEsperada.equals(dataObtida));

	}
}
