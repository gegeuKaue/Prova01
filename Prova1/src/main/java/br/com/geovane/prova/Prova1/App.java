package br.com.geovane.prova.Prova1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.joda.time.LocalDate;

/**
 * 
 * @author geovane.santos
 *
 */
public class App {
    public static void main(String[] args) {

        byte resp; 
        Scanner entrada = new Scanner(System.in);

        Empresa empresa;
        String nome, email, cnpj, nomeEndereco, bairro, cidade, cep;
        int numero;
        Estado estado;
        Set<Endereco> enderecoSet = new HashSet<Endereco>();
        System.out.println("Digite o nome da empresa.");
        nome = entrada.nextLine();

        System.out.println("Digite o email da empresa.");

        email = entrada.nextLine();
        do {
            System.out.println("Digite o cnpj da empresa");
            cnpj = entrada.nextLine();

            System.out.println("Digite o cep da empresa");
            cep = entrada.nextLine();

            System.out.println("Digite o sigla do estado da empresa");
            estado = estadoEscolhido(entrada.nextLine());

            System.out.println("Digite o nome da rua da empresa");
            nomeEndereco = entrada.nextLine();

            System.out.println("Digite o bairro da empresa");
            bairro = entrada.nextLine();

            System.out.println("Digite o cidade da empresa");
            cidade = entrada.nextLine();

            System.out.println("Digite o número da rua da empresa");
            numero = Integer.parseInt(entrada.nextLine());

            enderecoSet.add(new Endereco(nomeEndereco, bairro, cidade, cep, numero, estado));
            System.out.println("Você deseja adicionar mais endereços?(s/n)");
        } while (entrada.nextLine().equalsIgnoreCase("s"));

        empresa = new Empresa(nome, email, cnpj, enderecoSet);

        do

        {
            menu();

            resp = Byte.parseByte(entrada.nextLine());
            System.out.println("-------------------------------------------------------");
            Acao decisaoEnum = Acao.values()[resp - 1];
            switch (decisaoEnum) {
                case CADASTRAR_FUNCIONARIO:
                    empresa.addFuncionario(adicionarFuncionario(entrada));
                    break;
                case INFO_TODOS_FUNCIONARIO:

                    empresa.mostrarFuncionario();
                    break;
                case INFO_EMPRESA:
                    System.out.println(empresa);
                    break;

                case SAIR:
                    System.out.println("Saindo....");
                    break;
            }

            System.out.println("-------------------------------------------------------\n");

        } while (resp != 4);
        entrada.close();
    }

    private static Estado estadoEscolhido(String estadoString) {
        return Estado.valueOf(estadoString.toUpperCase());
    }

    public static void menu() {
        System.out.println("Digite o número correspondente o que se deseja fazer no sistema");
        System.out.println("\n1 - Cadastrar funcionario" + "\n2 - Ver Informações de todos os funcionario" + "\n3 - Ver Informação da empresa" + "\n4 - Sair");
    }

    public static Funcionario adicionarFuncionario(Scanner entrada) {
        int dia, mes, ano;
        LocalDate dataContratacao = null;
        int idade;
        double horarioEntrada;
        double horarioSaida;

        Funcionario funcionario;
        String nomeFuncionario, cargo, cpf, email;
        Set<TelefoneDDD> telefoneDDDSet = new HashSet<>();
        Set<String> telefoneSet = new HashSet<>();

        System.out.println("Digite o nome do funcionario");
        nomeFuncionario = entrada.nextLine();

        System.out.println("Digite o CPF do funcionario");
        cpf = entrada.nextLine();

        System.out.println("Digite o cargo do funcionario");
        cargo = entrada.nextLine();

        System.out.println("Digite o email do funcionario");
        email = entrada.nextLine();
        do {
            System.out.println("Digite o DDD do telefone;");
            telefoneDDDSet.add(dddUsuario(entrada.nextLine()));
            System.out.println("Você deseja continuar ?(s/n)");
        } while (entrada.nextLine().equalsIgnoreCase("s"));

        System.out.println("Digite a idade do funcionario");
        do {
            idade = Integer.parseInt(entrada.nextLine());
            if (idade < 0) {
                System.out.println("Digite uma idade valida!!!");
                System.out.println("Digite a idade do funcionario");
            }
        } while (idade < 0);

        System.out.println("Digite o horário de entrada do funcionario");
        do {
            horarioEntrada = Double.parseDouble(entrada.nextLine());
            if (!(horarioEntrada >= 0 && horarioEntrada < 24)) {
                System.out.println("Digite um horário entrada entre 0 ate 24h!!!");
                System.out.println("Digite o horário de entrada do funcionario");
            }
        } while (!(horarioEntrada >= 0 && horarioEntrada < 24));

        System.out.println("Digite o horário de saída do funcionario");

        do {
            horarioSaida = Double.parseDouble(entrada.nextLine());
            if (!(horarioSaida >= 0 && horarioSaida < 24)) {
                System.out.println("Digite um horário saída entre 0 ate 24h!!!");
                System.out.println("Digite o horário de saída do funcionario");
            }
        } while (!(horarioSaida >= 0 && horarioSaida < 24));

        System.out.println("Digite da dia de contratação do funcionario");
        dia = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o mês de contratação do funcionario");
        mes = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano de contratação do funcionario");
        ano = Integer.parseInt(entrada.nextLine());

        dataContratacao = new LocalDate(ano, dia, mes);
        funcionario = new Funcionario(nomeFuncionario, cargo, idade, horarioEntrada, horarioSaida, dataContratacao, cpf, telefoneDDDSet, email, telefoneSet);
        System.out.println("Funcionario cadastrado com sucesso!!!");
        return funcionario;
    }

    private static TelefoneDDD dddUsuario(String nextLine) {
        return TelefoneDDD.valueOf("DDD" + nextLine.toUpperCase());
    }

}
