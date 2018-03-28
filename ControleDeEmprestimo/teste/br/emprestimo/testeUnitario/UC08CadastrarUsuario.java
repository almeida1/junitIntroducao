package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC08CadastrarUsuario {
	static private Usuario usuario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setRa("11111");
		usuario.setNome("Jose da Silva");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01CadastrarUsuario_com_sucesso() {
		assertEquals("11111", usuario.getRa());
	}
	@Test
	public void CT02CadastrarUsuario_com_sucesso() {
		assertEquals("Jose da Silva", usuario.getNome());
	}
	@Test
	public void CT03CadastrarUsuario_com_sucesso() {
		Usuario resultadoEsperado = new Usuario();
		resultadoEsperado.setNome("Jose da Silva");
		resultadoEsperado.setRa("11111");
		assertTrue(resultadoEsperado.equals(usuario));
	}

}
