package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.com.six2six.fixturefactory.Fixture;

//@RunWith(value = JUnit4.class)

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FuncionarioTest {
    // assertEquals and assertThat

    @Test
    @BeforeAll
    public static void ficture_facture_funcionario() {
        Ficture.funcionarioNovoValido();
        Ficture.funcionarioNovoInvalidoIdade();
    }

    @Test
    @Order(1)
    public void verifica_os_get_e_os_set() {
        String nome = "Geovane";
        String cargo = "Estagiario";
        int idade = 19;
        double horarioEntrada = 9.5;
        double horarioSaida = 16.5;
        LocalDate dataContratacao = new LocalDate(2018, 1, 5);
        String cpf = "1111111111111";
        Set<TelefoneDDD> ddd = new HashSet<TelefoneDDD>();
        ddd.add(TelefoneDDD.DDD11);
        ddd.add(TelefoneDDD.DDD12);
        ddd.add(TelefoneDDD.DDD13);
        String email = nome + "@gmail.com";
        Set<String> telefoneSet = new HashSet<String>();
        telefoneSet.add("985191606");
        telefoneSet.add("985191806");
        telefoneSet.add("985191696");
        Funcionario funcionario = new Funcionario(nome, cargo, idade, horarioEntrada, horarioSaida, dataContratacao, cpf, ddd, email, telefoneSet);

        assertEquals(funcionario.getNome(), nome);
        assertEquals(funcionario.getCargo(), cargo);
        assertEquals(funcionario.getIdade(), idade);
        assertEquals(funcionario.getHorarioEntrada(), horarioEntrada);
        assertEquals(funcionario.getHorarioSaida(), horarioSaida);
        assertEquals(funcionario.getDataContratacao(), dataContratacao);
        assertEquals(funcionario.getCpf(), cpf);
        assertEquals(funcionario.getEmail(), email);
        assertEquals(funcionario.getDDD(), ddd);

    }

    // assertThat and Before
    @Test
    @BeforeEach
    @DisplayName("Retorna verdadeiro se o hashCode e o Equals são iguais")
    public void deverar_retornar_verdadeiro_se_o_hashCode_e_o_equals_sao_iguais() {
        Funcionario fun = Fixture.from(Funcionario.class).gimme("valido");
        Funcionario fun2 = fun;
        assertEquals(fun.hashCode(), fun2.hashCode());
        assertTrue(fun.equals(fun2));
    }

    // AssertThat and After
    @Test
    // @AfterEach
    public void deverar_retornar_falso_se_o_hashCode_caso_as_classe_seja_diferente() {
        Ficture.funcionarioNovoValido();
        Ficture.funcionarioNovoInvalidoIdade();

        Funcionario funcionario = Fixture.from(Funcionario.class).gimme("valido");
        Funcionario funcionario2 = Fixture.from(Funcionario.class).gimme("invalido");
        assertThat(funcionario.hashCode(), is(not(funcionario2)));
    }

    // Exception Testing
    @Test
    @Order(2)
    public void deverar_dar_erro_de_argumento_por_receber_idade_negativa() {
        Ficture.funcionarioNovoInvalidoIdade();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Funcionario fun = Fixture.from(Funcionario.class).gimme("invalido");
            fun.setIdade(-18);
        });
    }

    // Exception Testing
    @Test
    @Order(3)
    public void deverar_dar_erro_de_argumento_por_receber_um_horario_de_entrada_que_nao_for_entre_0_a_24() {
        double horarioEntrada = 25;
        assertThrows(IllegalArgumentException.class, () -> {
            Funcionario fun = Fixture.from(Funcionario.class).gimme("valido");
            fun.setHorarioEntrada(horarioEntrada);
        });
    }

    // Exception Testing
    @Test
    @Order(4)
    public void deverar_dar_erro_de_argumento_por_receber_um_horario_de_saida_que_nao_for_entre_0_a_24() {
        Ficture.funcionarioNovoInvalidoIdade();
        assertThrows(IllegalArgumentException.class, () -> {
            Funcionario fun = Fixture.from(Funcionario.class).gimme("invalido");
            fun.setHorarioEntrada(28);
        });
    }
}
