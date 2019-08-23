package br.com.geovane.prova.Prova1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.br.CNPJ;
import org.jetbrains.annotations.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class Empresa.
 *
 * @author geovane.santos
 */
public class Empresa {

    /** The nome. */
    @Valid
    @NotBlank(message = "Não pode ser nulo")
    private String nome;

    /** The email. */
    @Email(message = "O email está inválido")
    private String email;

    /** The cnpj. */
    @CNPJ(message = "O CNPJ está invalido")
    private String cnpj;

    /** The endereco. */
    @NotNull(value = "O endereço está vazio")
    private Set<Endereco> enderecoSet;

    /** The lista funcionario. */
    @NotNull
    private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

    /**
     * Instantiates a new empresa.
     *
     * @param nome the nome
     * @param email the email
     * @param cnpj the cnpj
     * @param enderecoSet the endereco set
     */
    public Empresa(@NotEmpty(message = "Não pode ser nulo") String nome, @Email(message = "O email está invalido") String email, @CNPJ(message = "O CNPJ está invalido") String cnpj,
                   Set<Endereco> enderecoSet) {
        this.nome = nome;
        this.email = email;
        this.cnpj = cnpj;
        this.enderecoSet = enderecoSet;

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
        // Preconditions.
        listaVazia(this.listaFuncionario);
        for(Funcionario funcionario : this.listaFuncionario)
            System.out.println(funcionario + "\n");
    }

    /**
     * Lista vazia.
     *
     * @param list the list
     */
    private void listaVazia(List<Funcionario> list) {
        if (list.size() == 0 || list == null) {
            throw new ListEmptyOrNullException("A lista esta vazia!!!");
        }

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
    public List<Funcionario> getListFuncionario() {
        return listaFuncionario;
    }

    /**
     * Gets the endereco set.
     *
     * @return the endereco set
     */
    public Set<Endereco> getEnderecoSet() {
        return enderecoSet;
    }

    /**
     * Sets the endereco set.
     *
     * @param enderecoSet the new endereco set
     */
    public void setEnderecoSet(Set<Endereco> enderecoSet) {
        this.enderecoSet = enderecoSet;
    }

}
