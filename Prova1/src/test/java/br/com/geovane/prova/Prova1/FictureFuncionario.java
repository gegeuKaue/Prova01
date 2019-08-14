package br.com.geovane.prova.Prova1;

import java.time.LocalDate;
import java.util.Random;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

// TODO: Auto-generated Javadoc
/**
 * The Class FictureFuncionario.
 */
public class FictureFuncionario {

    /**
     * Funcionario novo valido.
     */
    public static void funcionarioNovoValido() {
        try {
            Fixture.of(Funcionario.class).addTemplate("valido", new Rule() {
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
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    
    /**
     * Funcionario novo invalido idade.
     */
    public static void funcionarioNovoInvalidoIdade() {

        Fixture.of(Funcionario.class).addTemplate("invalido", new Rule() {
            {
                // String nome, String cargo, int idade, double horarioEntrada, double horarioSaida, LocalDate dataContratacao
                add("nome", random("Geovane Kaue Santos", "Aline Azevedo Barbosa", "Jatobar"));
                add("cargo", random("Estagiario", "Analista", "Direitor"));
                add("idade", random(Integer.class, range(-79, -8)));
                add("horarioEntrada", random(Double.class, range(23, 59)));
                add("horarioSaida", random(Double.class, range(-25, 18)));
                // int year, int month, int dayOfMonth
                add("dataContratacao", LocalDate.of(new Random().nextInt(19) + 2000, new Random().nextInt(1) + 12, new Random().nextInt(1) + 30));
            }
        });

    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        funcionarioNovoValido();
        funcionarioNovoInvalidoIdade();
        try {
            Funcionario funcionario = Fixture.from(Funcionario.class).gimme("valido");
            Funcionario funcionario2  = Fixture.from(Funcionario.class).gimme("invalido");
            System.out.println(funcionario);
            System.out.println(funcionario2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
