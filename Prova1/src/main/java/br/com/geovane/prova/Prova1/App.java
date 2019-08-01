package br.com.geovane.prova.Prova1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author geovane.santos
 *
 */
public class App {
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		System.out.println(date);
		// dados dos sistema
		char resp;
		Scanner entrada = new Scanner(System.in);

		// dados da empresa e do endereco
		Empresa empresa;
		String nome, email, cnpj, nomeEndereco, bairro, cidade, cep;
		short numero;

		System.out.println("Digite o nome da empresa");
		nome = entrada.nextLine();

		System.out.println("Digite o email da empresa");
		email = entrada.nextLine();

		System.out.println("Digite o cnpj da empresa");
		cnpj = entrada.nextLine();

		System.out.println("Digite o nome da rua da empresa");
		nomeEndereco = entrada.nextLine();

		System.out.println("Digite o bairro da empresa");
		bairro = entrada.nextLine();

		System.out.println("Digite o cidade da empresa");
		cidade = entrada.nextLine();

		System.out.println("Digite o número da rua da empresa");
		numero = Short.parseShort(entrada.nextLine());

		System.out.println("Digite o cep da empresa");
		cep = entrada.nextLine();
		empresa = new Empresa(nome, email, cnpj, nomeEndereco, bairro, cidade, cep, numero);
		System.out.println(empresa);
		do {
			menu();
			resp = entrada.nextLine().charAt(0);
			switch (resp) {
			case 1:
				empresa.addFuncionario(adicionarFuncionario(entrada));
				break;
			case 2:
				empresa.mostrarFuncionario();
				break;
			case 3:
				System.out.println(empresa);
				break;
			case 4:
				continue;
			}
		} while (resp != 4);
		entrada.close();
	}

	public static void menu() {
		System.out.println("Digite o número correspondente o que se deseja fazer no sistema");
		System.out.println("1 - Cadastrar funcionario" + "2 - Ver Inforções de todos os funcionario"
				+ "3 - Ver Informação da empresa" + "4 - Sair");
	}

	public static Funcionario adicionarFuncionario(Scanner entrada) {
		// dados dos funcionario
		Funcionario funcionario;
		String nomeFuncionario, cargo;
		short idade;
		float horarioEntrada;
		float horarioSaida;
		System.out.println("Digite o nome do funcionario");
		nomeFuncionario = entrada.nextLine();
		System.out.println("Digite o cargo do funcionario");
		cargo = entrada.nextLine();
		System.out.println("Digite a idade do funcionario");
		idade = Short.parseShort(entrada.nextLine());
		System.out.println("Digite o horário de entrada do funcionario");
		horarioEntrada = Float.parseFloat(entrada.nextLine());
		System.out.println("Digite o horário de saída do funcionario");
		horarioSaida = Float.parseFloat(entrada.nextLine());
		funcionario = new Funcionario(nomeFuncionario, cargo, idade, horarioEntrada, horarioSaida);
		return funcionario;
	}

}
