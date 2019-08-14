package br.com.geovane.prova.Prova1;

import java.time.LocalDate;
import java.util.Random;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class FictureFuncionario {
    public static void FuncionarioNovoValido() {
        Fixture.of(Funcionario.class).addTemplate("novofuncionario", new Rule() {
            {
                // String nome, String cargo, int idade, double horarioEntrada, double horarioSaida, LocalDate dataContratacao
                add("nome", random("Geovane Kaue Santos", "Aline Azevedo Barbosa", "Jatobar"));
                add("cargo", random("Estagiario", "Analista", "Direitor"));
                add("idade", random(Integer.class, range(18, 79)));
                add("horarioEntrada", random(Double.class, range(7, 9)));
                add("horarioSaida", random(Double.class, range(16, 18)));
                // int year, int month, int dayOfMonth
                add("dataContratacao", LocalDate.of(new Random().nextInt(19) + 2000, new Random().nextInt(1) + 12, new Random().nextInt(1) + 30));
            }
        });
    }

    public static void FuncionarioNovoInValido() {
        Fixture.of(Funcionario.class).addTemplate("novofuncionario", new Rule() {
            {
                // String nome, String cargo, int idade, double horarioEntrada, double horarioSaida, LocalDate dataContratacao
                add("nome", random("Geovane Kaue Santos", "Aline Azevedo Barbosa", "Jatobar"));
                add("cargo", random("Estagiario", "Analista", "Direitor"));
                add("idade", random(Integer.class, range(-18, 79)));
                add("horarioEntrada", random(Double.class, range(23, 59)));
                add("horarioSaida", random(Double.class, range(-25, 18)));
                // int year, int month, int dayOfMonth
                add("dataContratacao", LocalDate.of(new Random().nextInt(19) + 2000, new Random().nextInt(1) + 12, new Random().nextInt(1) + 30));
            }
        });
    }
}
