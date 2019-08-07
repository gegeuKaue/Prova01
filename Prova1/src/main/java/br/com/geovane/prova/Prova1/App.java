package br.com.geovane.prova.Prova1;

import java.util.Scanner;

/**
 * 
 * @author geovane.santos
 *
 */
public class App {
	public static void main(String[] args) {

		// dados dos sistema
		byte resp;
		Scanner entrada = new Scanner(System.in);

		// dados da empresa e do endereco
		Empresa empresa;
		String nome, email, cnpj, nomeEndereco, bairro, cidade, cep;
		int numero;

		System.out.println("Digite o nome da empresa");
		nome = entrada.nextLine();

		System.out.println("Digite o email da empresa");

		email = entrada.nextLine();

		System.out.println("Digite o cnpj da empresa");
		cnpj = entrada.nextLine();

		System.out.println("Digite o cep da empresa");
		cep = entrada.nextLine();

		System.out.println("Digite o nome da rua da empresa");
		nomeEndereco = entrada.nextLine();

		System.out.println("Digite o bairro da empresa");
		bairro = entrada.nextLine();

		System.out.println("Digite o cidade da empresa");
		cidade = entrada.nextLine();

		System.out.println("Digite o número da rua da empresa");
		numero = Integer.parseInt(entrada.nextLine());

		empresa = new Empresa(nome, email, cnpj, nomeEndereco, bairro, cidade, cep, numero);

		do {
			menu();

			resp = Byte.parseByte(entrada.nextLine());

			System.out.println("-------------------------------------------------------");

			if (resp == 1) {
				empresa.addFuncionario(adicionarFuncionario(entrada));
			} else if (resp == 2) {
				empresa.mostrarFuncionario();
			} else if (resp == 3) {
				System.out.println(empresa);
			}

			System.out.println("-------------------------------------------------------\n");

		} while (resp != 4);
		entrada.close();
	}

	public static void menu() {
		System.out.println("Digite o número correspondente o que se deseja fazer no sistema");
		System.out.println("\n1 - Cadastrar funcionario" + "\n2 - Ver Inforções de todos os funcionario"
				+ "\n3 - Ver Informação da empresa" + "\n4 - Sair");
	}

	public static Funcionario adicionarFuncionario(Scanner entrada) {
		// dados dos funcionario
		Funcionario funcionario;
		String nomeFuncionario, cargo;
		int idade;
		double horarioEntrada;
		double horarioSaida;
		System.out.println("Digite o nome do funcionario");
		nomeFuncionario = entrada.nextLine();

		System.out.println("Digite o cargo do funcionario");
		cargo = entrada.nextLine();

		System.out.println("Digite a idade do funcionario");
		do {
			idade = Integer.parseInt(entrada.nextLine());
			if (idade < 0) {
				System.out.println("Digite uma idade valida!!!");
				System.out.println("Digite a idade do funcionario");
			}
		} while (idade < 0);

		System.out.println("Digite o horário de entrada do funcionario");
		horarioEntrada = Double.parseDouble(entrada.nextLine());

		System.out.println("Digite o horário de saída do funcionario");
		horarioSaida = Double.parseDouble(entrada.nextLine());

		funcionario = new Funcionario(nomeFuncionario, cargo, idade, horarioEntrada, horarioSaida);

		System.out.println("Funcionario cadastrado com sucesso!!!");
		return funcionario;
	}

}
