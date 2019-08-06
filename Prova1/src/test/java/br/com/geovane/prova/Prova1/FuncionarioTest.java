package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@RunWith(value = JUnit4.class)

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FuncionarioTest {

	@Test
	@Order(1)
	@BeforeAll
	public static void verificar_se_os_dados_criados_foram_armazenado_com_sucesso() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = 19;
		double horarioEntrada = 9.0, horarioSaida = 16.0;
		Funcionario funcionario = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);

		assertEquals(nome, funcionario.getNome());
		assertEquals(cargo, funcionario.getCargo());
		assertEquals(idade, funcionario.getIdade());

		assertThat(horarioEntrada, is(funcionario.getHorarioEntrada()));
		assertThat(horarioSaida, is(funcionario.getHorarioSaida()));
	}

	@Test
	@BeforeEach
	public void deverar_retornar_verdadeiro_o_hashCode_caso_as_classe_seja_igual() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = 19;
		double horarioEntrada = 9.0, horarioSaida = 16.0;
		Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
		Funcionario fun2 = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
		assertThat(fun.hashCode(), is(fun2.hashCode()));
	}

	@Test
	@AfterEach
	public void deverar_retornar_falso_se_o_hashCode_caso_as_classe_seja_diferente() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = 28;
		double horarioEntrada = 9.0, horarioSaida = 16.0;
		Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
		// funcionario a baixo tem mais idade
		Funcionario fun2 = new Funcionario(nome, cargo, idade + 6, horarioEntrada, horarioSaida);
		assertThat(fun.hashCode(), is(not(fun2)));
	}

	@Test
	@Order(2)
	public void deverar_dar_erro_de_argumento_por_receber_idade_negativa() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = -15;
		double horarioEntrada = 9.0, horarioSaida = 16.0;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
			fun.setIdade(18);
		});
	}
	@Test
	@Order(3)
	public void deverar_dar_erro_de_argumento_por_receber_um_horario_de_entrada_que_nao_for_entre_0_a_24() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = -15;
		double horarioEntrada = 25, horarioSaida = 16.0;
		assertThrows(IllegalArgumentException.class, () ->{
			Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
			fun.setHorarioEntrada(horarioEntrada);
		});
	}
	@Test
	@Order(4)
	public void deverar_dar_erro_de_argumento_por_receber_um_horario_de_saida_que_nao_for_entre_0_a_24() {
		String nome = "Geovane Kaue Santos", cargo = "Estagiario";
		int idade = -15;
		double horarioEntrada = 9.0, horarioSaida = -1;
		assertThrows(IllegalArgumentException.class, () ->{
			Funcionario fun = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
			fun.setHorarioEntrada(horarioEntrada);
		});
	}

}
