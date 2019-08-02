package br.com.geovane.prova.Prova1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(value = JUnit4.class)
public class EmpresaTest {
	Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
			"Res. Flamboyant", "São Paulo", "08588145", (short) 4);

	@Test
	public void teste_HashCode_verdadeiro() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
		Empresa empresa2 = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);
		assertEquals(true, empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void teste_HashCode_falso() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", (short) 4);

		Empresa empresa2 = new Empresa("Cont", "contmatic@contmatic.com.br", "11111111111", "rua das frutas", "Caiuby",
				"São Paulo", "08544789", (short) 498);
		assertEquals(false, empresa.hashCode() == empresa2.hashCode());

	}
//	@Test
//	@ParameterizedTest
//	@MethodSource("Funcionario")
//	 void testAddFuncionario(String nome, String cargo, short idade, float horarioEntrada, float horarioSaida) {
//		Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
//		empresa.addFuncionario(fun);
//		assertEquals(empresa.getFuncionario(0), fun);
//	}


}
