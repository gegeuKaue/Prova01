package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class EnderecoTest {
    // assertThat
    @Test
    public void deverar_retornar_verdadeiro_o_hashCode_caso_as_classe_seja_igual() {
        String nome = "Rua João Pedroso Batista", bairro = "Res. Flamboyant", cidade = "São Paulo", cep = "08588145";
        int numero = 367;
        Endereco end = new Endereco(nome, bairro, cidade, cep, numero);
        Endereco end2 = new Endereco(nome, bairro, cidade, cep, numero);
        Assert.assertThat(end.hashCode(), is(end2.hashCode()));
    }

    // assertThat and After
    @Test
    @AfterEach
    public void deverar_retornar_falso_se_o_hashCode_caso_as_classe_seja_diferente() {
        String nome = "Rua João Pedroso Batista", bairro = "Res. Flamboyant", cidade = "São Paulo", cep = "08588145";
        int numero = 367;
        Endereco end = new Endereco(nome, bairro, cidade, cep, numero);
        // o número da casa é diferente
        Endereco end2 = new Endereco(nome, bairro, cidade, cep, 369);
        Assert.assertThat(1 + end.hashCode(), is(not(end2.hashCode())));
    }

}
