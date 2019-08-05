package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.common.collect.Lists;

@RunWith(value = JUnit4.class)
public class EmpresaTest {
	Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
			"Res. Flamboyant", "São Paulo", "08588145", 4);

	@Test
	public void teste_HashCode_verdadeiro() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", 4);
		Empresa empresa2 = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", 4);
		assertEquals(true, empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void teste_HashCode_falso() {
		Empresa empresa = new Empresa("Contmatic", "contmatic@contmatic.com", "9999999999999", "rua jaboticabeira",
				"Res. Flamboyant", "São Paulo", "08588145", 4);

		Empresa empresa2 = new Empresa("Cont", "contmatic@contmatic.com.br", "11111111111", "rua das frutas", "Caiuby",
				"São Paulo", "08544789", 498);
		assertEquals(false, empresa.hashCode() == empresa2.hashCode());

	}

	@Test
	public void deverar_adicionar_empregado_na_lista_da_empresa() {

		Funcionario fun = new Funcionario("Geovane Kaue", "estagio",  19, 9, 16);
		Funcionario fun2 = new Funcionario("Geovane Kaue", "Desenvolvedor",  29, 9, 18);
		empresa.addFuncionario(fun);
		empresa.addFuncionario(fun2);

		assertThat(empresa.getListFuncionario(), hasItems(fun, fun2));
	}
	@Test(expected = ArithmeticException.class)
	public void error() {
		int i = 5/1;
	}

	@Test
	public void deverar_mudar_o_endereco_da_empresa() {
		Endereco endereco = new Endereco("Rua Jaboticabeira", "Jardim Caubi", "São Paulo", "0885589", 357);
		empresa.setEndereco(endereco);
		assertEquals(empresa.getEndereco(), endereco);
	}

	@Test(timeout = 100)
	public void deverar_armazenar_100_funcionario_em_100_millis() {
		Funcionario funcionario = new Funcionario("Geovane Kaue Santos", "Estagiário", 19, 9.0, 16.0);
		for (int i = 0; i < 1000; i++)
			empresa.addFuncionario(funcionario);
	}

	@Test
	public void deverar_ter_todos_os_dados_passado_no_construtor() {
		String nome = "Contmatic", email = "cont@contmatic.com", cnpj = "78954785236", nomeEndereco = "Rua das Frutas",
				bairro = "Jardim Caiuby", cidade = "São Paulo", cep = "08588145";
		short numero = 357;

		Empresa empresa = new Empresa(nome, email, cnpj, nomeEndereco, bairro, cidade, cep, numero);
		List<String> list = Lists.newArrayList(empresa.getNome(), empresa.getEmail(), empresa.getCnpj(),
				empresa.getEndereco().getNome(), empresa.getEndereco().getBairro(), empresa.getEndereco().getCidade(),
				empresa.getEndereco().getCep());
		ArrayList<String> listaComDados = Lists.newArrayList(nome, email, cnpj, nomeEndereco, bairro, cidade, cep);
		assertEquals(list, listaComDados);
		assertEquals(empresa.getEndereco().getNumero(), numero);
	}
}
