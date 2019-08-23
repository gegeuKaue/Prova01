package br.com.geovane.prova.Prova1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

//Test Runners
@RunWith(JUnitPlatform.class)
@SelectClasses({EmpresaTest.class, EnderecoTest.class,FuncionarioTest.class})
class Test {

}
