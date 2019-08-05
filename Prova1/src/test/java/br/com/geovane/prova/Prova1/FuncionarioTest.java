package br.com.geovane.prova.Prova1;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

@RunWith(value = JUnit4.class)
public class FuncionarioTest extends TestCase {

	@BeforeClass
	public static void test() {
		System.out.println("teste");
	}

	@Test
	public void te() {
		System.out.println("");
	}
//	@Test
//	@ParameterizedTest
//	@CsvSource({ "Geovane Kaue Santos, Estagiário, 19, 9.0, 16.0" })
//	public void verificar_se_os_dados_criados_foram_armazenado_com_sucesso(String nome, String cargo, int idade,
//			double horarioEntrada, double horarioSaida) {
//		Funcionario funcionario = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
//		assertEquals(nome, funcionario.getNome());
//		assertEquals(cargo, funcionario.getCargo());
//		assertEquals(idade, funcionario.getIdade());
//		assertEquals(horarioEntrada, funcionario.getHorarioEntrada());
//		assertEquals(horarioSaida, funcionario.getHorarioSaida());
//	}

}
