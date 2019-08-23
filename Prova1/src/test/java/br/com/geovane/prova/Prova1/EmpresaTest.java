package br.com.geovane.prova.Prova1;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import br.com.six2six.fixturefactory.Fixture;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmpresaTest {
    @BeforeAll
    @Test
    public static void setUp() {
        Ficture.funcionarioNovoValido();
        Ficture.EmpresaNovoValido();
    }

    // Assertions
    @Test
    @Order(1)
    public void deverar_o_HashCode_retornar_verdadeiro() {
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresaValida");
        Empresa empresa2 = empresa;
        assertEquals(true, empresa.hashCode() == empresa2.hashCode());
    }

    // // Assertions
    @Test
    @Order(2)
    public void deverar_o_HashCode_retornar_falso() {
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresaValida");
        Empresa empresa2 = Fixture.from(Empresa.class).gimme("empresaValida");
        empresa.setNome("");
        assertFalse(empresa.hashCode() == empresa2.hashCode());
    }

    // // AssertThat
    @Test
    @Order(3)
    public void deverar_adicionar_empregado_na_lista_da_empresa() {
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresaValida");
        Funcionario fun = Fixture.from(Funcionario.class).gimme("valido");
        Funcionario fun2 = Fixture.from(Funcionario.class).gimme("valido");
        empresa.addFuncionario(fun);
        empresa.addFuncionario(fun2);
        assertThat(empresa.getListFuncionario(), hasItems(fun, fun2));
    }

    //
    // Timeout
    @Order(4)
    @Test
    public void deverar_adicionar_1000_funcionario_em_100_milesimo() {

        assertTimeout(Duration.ofMillis(100), () -> {
            Empresa empresa = Fixture.from(Empresa.class).gimme("empresaValida");
            Funcionario funcionario = Fixture.from(Funcionario.class).gimme("valido");
            int i;
            for(i = 0 ; i < 1000 ; i++)
                empresa.addFuncionario(funcionario);
        });
    }
}
