package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.six2six.fixturefactory.Fixture;

public class EnderecoTest {
    // assertThat
    @BeforeAll
    @Test
    public static void setUp() {
        Ficture.enderecoNovoValido();
    }

    @Test
    public void deverar_retornar_verdadeiro_o_hashCode_caso_as_classe_seja_igual() {
        Endereco end = Fixture.from(Endereco.class).gimme("enderecoValido");
        Endereco end2 = end;
        Assert.assertThat(end.hashCode(), is(end2.hashCode()));
    }

    //
    // // assertThat and After
    @Test
    @AfterEach
    public void deverar_retornar_falso_se_o_hashCode_caso_as_classe_seja_diferente() {
        Endereco end = Fixture.from(Endereco.class).gimme("enderecoValido");
        end.setNome("");
        // o número da casa é diferente
        Endereco end2 = Fixture.from(Endereco.class).gimme("enderecoValido");
        Assert.assertThat(1 + end.hashCode(), is(not(end2.hashCode())));
    }

}
