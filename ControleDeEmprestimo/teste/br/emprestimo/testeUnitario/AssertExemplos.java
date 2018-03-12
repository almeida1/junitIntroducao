package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertExemplos {

	   @Test
	   public void AssertExemplos() {
	      //test data
	      String str1 = new String ("abc");
	      String str2 = new String ("abc");
	      String str3 = null;
	      String str4 = "abc";
	      String str5 = "abc";
			
	      int val1 = 5;
	      int val2 = 6;

	      String[] arrayEsperado = {"um", "dois", "treis"};
	      String[] arrayObtido =  {"um", "dois", "trei"};

	      //Verifica se dois objetos sao iguais
	      assertEquals(str1, str2);

	      //Verifica se uma condicao eh verdadeira
	      assertTrue (val1 < val2);

	      //Verifica se uma condicao eh falsa
	      assertFalse(val1 > val2);

	      //Verfifica se um objeto nao eh nulo
	      assertNotNull(str1);

	      //Verifica se um objto e nulo
	      assertNull(str3);

	      //Verifica se dois objetos do tipo array sao iguais.
	      assertArrayEquals(arrayEsperado, arrayObtido);
	   }
	}