package br.com.geovane.prova.Prova1;

import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@RunWith(value = JUnit4.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FuncionarioTest {

	@BeforeClass
	public static void test() {
		System.out.println("teste");
	}

	@Test
	@Order(2)
	@DisplayName("Deverar retornar valor x")
	public void a() {
		System.out.println("Primeiro");
	}

	@Test
	@Order(3)
	public void b() {
		System.out.println("Segundo");
	}

	@Test
	@Order(1)
	public void c() {
		System.out.println("Terceiro");
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
