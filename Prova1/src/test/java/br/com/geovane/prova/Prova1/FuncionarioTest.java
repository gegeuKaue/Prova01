package br.com.geovane.prova.Prova1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import junit.framework.TestCase;

@RunWith(value = JUnit4.class)
public class FuncionarioTest extends TestCase {

	@ParameterizedTest
	@CsvSource({ "Geovane Kaue Santos, Estagiário, 19, 9.0, 16.0" })
	public void verificar_se_os_dados_criados_foram_armazenado_com_sucesso(String nome, String cargo, short idade,
			double horarioEntrada, double horarioSaida) {
		Funcionario funcionario = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida);
		assertEquals(nome, funcionario.getNome());
		assertEquals(cargo, funcionario.getCargo());
		assertEquals(idade, funcionario.getIdade());
		assertEquals(horarioEntrada, funcionario.getHorarioEntrada());
		assertEquals(horarioSaida, funcionario.getHorarioSaida());
	}

}
