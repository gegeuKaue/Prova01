package br.com.geovane.prova.Prova1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.LocalDate;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

// TODO: Auto-generated Javadoc
/**
 * The Class FictureFuncionario.
 */
public class Ficture {
    /**
     * Funcionario novo valido.
     */
    public static void funcionarioNovoValido() {
        try {
            Fixture.of(Funcionario.class).addTemplate("valido", new Rule() {
                {
                     add("nome", random("Geovane", "Aline", "Jatobar", "Kaue"));
                    add("cargo", random("Estagiario", "Analista", "Direitor"));
                    add("idade", random(Integer.class, range(18, 79)));
                    add("horarioEntrada", random(Double.class, range(7, 9)));
                    add("horarioSaida", random(Double.class, range(16, 18)));
                   
                    int ano = ((int) (2000 + Math.random() * (20)));
                    Integer dia = ((int) (1 + Math.random() * (31)));
                    Integer mes = ((int) (1 + Math.random() * (11)));

                    add("dataContratacao", new LocalDate(ano, mes, dia));
                    add("cpf", random(String.class, RandomStringUtils.randomNumeric(11)));

                    Set<TelefoneDDD> ddds = new HashSet<TelefoneDDD>();
                    ddds.add(TelefoneDDD.valueOf("DDD11"));
                    ddds.add(TelefoneDDD.valueOf("DDD15"));
                    ddds.add(TelefoneDDD.valueOf("DDD35"));
                    add("ddd", ddds);
                    add("email", "${nome}@gmail.com");
                    Set<String> telefoneSet = new HashSet<String>();
                    telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                    telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                    telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                    add("telefoneSet", telefoneSet);
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
                add("nome", random("Geovane", "Aline Azevedo Barbosa", "Jatobar", "Kaue"));
                add("cargo", random("Estagiario", "Analista", "Direitor"));
                add("idade", random(Integer.class, range(-79, -8)));
                add("horarioEntrada", random(Double.class, range(23, 59)));
                add("horarioSaida", random(Double.class, range(-25, 18)));
                int ano = ((int) (2000 + Math.random() * (20)));
                Integer dia = ((int) (1 + Math.random() * (25)));
                Integer mes = ((int) (1 + Math.random() * (11)));

                add("dataContratacao", new LocalDate(ano, mes, dia));
                add("cpf", random(String.class, RandomStringUtils.randomNumeric(11)));
                Set<TelefoneDDD> ddds = new HashSet<TelefoneDDD>();
                ddds.add(TelefoneDDD.values()[new Random().nextInt(TelefoneDDD.values().length - 1)]);
                ddds.add(TelefoneDDD.values()[new Random().nextInt(TelefoneDDD.values().length - 1)]);
                ddds.add(TelefoneDDD.values()[new Random().nextInt(TelefoneDDD.values().length - 1)]);
                ddds.add(TelefoneDDD.values()[new Random().nextInt(TelefoneDDD.values().length - 1)]);
                ddds.add(TelefoneDDD.values()[new Random().nextInt(TelefoneDDD.values().length - 1)]);
                add("ddd", ddds);
                add("email", "${nome}@gmail.com");
                Set<String> telefoneSet = new HashSet<String>();
                telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                telefoneSet.add("9" + RandomStringUtils.randomNumeric(8));
                add("telefoneSet", telefoneSet);
            }
        });

    }

    public static void enderecoNovoValido() {
        Fixture.of(Endereco.class).addTemplate("enderecoValido", new Rule() {
            {
                add("nome", random("Rua São José", "Av. Brasil", "Rua Sete de Setembro", "Rua Tiradentes"));
                add("bairro", random("Samambaia Sul (Samambaia)", "Quadra Trinta e Um", "Rua Europa", "Rua das Palmas", "Avenida João Antônio Silveira", "Rua das Eugênias"));
                add("cidade", random("Goiânia", "Salvador", "Maracanaú", "Vitória", "Santa Rita", "Macapá"));
                add("cep", random("68901-261", "06250-022", "97030-330", "71825-117", "09790-220", "29314-843", "76829-376"));
                add("numero", random(Integer.class, range(100, 555)));
                add("estado", Estado.values()[new Random().nextInt(Estado.values().length - 1)]);
            }
        });
    }

    public static void EmpresaNovoValido() {
        /**
         * nome email cnpj enderecoSet listaFuncionario
         */
        Fixture.of(Empresa.class).addTemplate("empresaValida", new Rule() {
            {
                funcionarioNovoValido();
                enderecoNovoValido();
                add("nome", random("Contmatic", "Ítau", "Sony"));
                add("email", "{nome}@gmail.com");
                add("cnpj", RandomStringUtils.randomNumeric(14));
                Set<Endereco> enderecoSet = new HashSet<Endereco>();
                enderecoSet.add(Fixture.from(Endereco.class).gimme("enderecoValido"));
                enderecoSet.add(Fixture.from(Endereco.class).gimme("enderecoValido"));
                add("enderecoSet", enderecoSet);
                List<Funcionario> funcionariosList = new ArrayList<Funcionario>();
                funcionariosList.add(Fixture.from(Funcionario.class).gimme("valido"));
                funcionariosList.add(Fixture.from(Funcionario.class).gimme("valido"));
                funcionariosList.add(Fixture.from(Funcionario.class).gimme("valido"));
                funcionariosList.add(Fixture.from(Funcionario.class).gimme("valido"));
                funcionariosList.add(Fixture.from(Funcionario.class).gimme("valido"));
                add("listaFuncionario", funcionariosList);
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
        EmpresaNovoValido();
        enderecoNovoValido();
        try {
            Funcionario funcionario = Fixture.from(Funcionario.class).gimme("valido");
            Funcionario funcionario2 = Fixture.from(Funcionario.class).gimme("invalido");
            Empresa empresa = Fixture.from(Empresa.class).gimme("empresaValida");
            Endereco endereco = Fixture.from(Endereco.class).gimme("enderecoValido");
            System.out.println(funcionario);
            System.out.println(funcionario2);
            System.out.println(empresa);
            System.out.println(endereco);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
