package br.com.geovane.prova.Prova1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {
	Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com",
			"9999999999999", "rua jaboticabeira",
			"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
	@Test
	public void teste_HashCode_verdadeiro() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com",
				"9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
		Empresa empresa2 = new Empresa("Contmatic", "contmatic@contmatic.com",
				"9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
		assertEquals(true, empresa.hashCode() == empresa2.hashCode());

	}
	@Test
	public void teste_HashCode_falso() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com",
				"9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
		
		Empresa empresa2 = new Empresa("Cont", "contmatic@contmatic.com.br",
				"11111111111", "rua das frutas",
				"Caiuby", "São Paulo", "08544789", (short) 498);
		assertEquals(false, empresa.hashCode() == empresa2.hashCode());

	}
	@Test 
	public void test_do_e() {
		
	}
	
	/*@Test
	public void testEmpresa() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddFuncionario() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarFuncionario() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}*/

}
