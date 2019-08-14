package br.com.geovane.prova.Prova1;

import java.util.ArrayList;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.br.CNPJ;
import org.jetbrains.annotations.NotNull;


/**
 * The Class Empresa.
 *
 * @author geovane.santos
 */
public class Empresa {

    /** The nome. */
    @NotEmpty(message = "Não pode ser nulo")
    private String nome;

    /** The email. */
    @Email
    private String email;

    /** The cnpj. */
    @CNPJ
    private String cnpj;

    /** The endereco. */
    @NotNull
    private Endereco endereco;

    /** The lista funcionario. */
    @NotNull
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    /**
     * Instantiates a new empresa.
     *
     * @param nome the nome
     * @param email the email
     * @param cnpj the cnpj
     * @param nomeEndereco the nome endereco
     * @param bairro the bairro
     * @param cidade the cidade
     * @param cep the cep
     * @param numero the numero
     */
    public Empresa(String nome, String email, String cnpj, String nomeEndereco, String bairro, String cidade, String cep, int numero) {

        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        endereco = new Endereco(nomeEndereco, bairro, cidade, cep, numero);
    }

    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the cnpj.
     *
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the cnpj.
     *
     * @param cnpj the new cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Adds the funcionario.
     *
     * @param funcionario the funcionario
     */
    public void addFuncionario(Funcionario funcionario) {
        this.listaFuncionario.add(funcionario);
    }

    /**
     * Mostrar funcionario.
     */
    public void mostrarFuncionario() {
        if (this.listaFuncionario.size() == 0) {
            System.out.println("Não tem funcionario cadastrado!!!");
            return;
        }
        for(Funcionario funcionario : this.listaFuncionario)
            System.out.println(funcionario + "\n");
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /**
     * Gets the funcionario.
     *
     * @param index the index
     * @return the funcionario
     */
    public Funcionario getFuncionario(int index) {
        return listaFuncionario.get(index);
    }

    /**
     * Gets the list funcionario.
     *
     * @return the list funcionario
     */
    public ArrayList<Funcionario> getListFuncionario() {
        return listaFuncionario;
    }

    /**
     * Sets the endereco.
     *
     * @param endereco the new endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Gets the endereco.
     *
     * @return the endereco
     */
    public Endereco getEndereco() {
        return this.endereco;
    }

}
