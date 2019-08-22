package br.com.geovane.prova.Prova1;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.br.CPF;
import org.joda.time.LocalDate;

import static com.google.common.base.Preconditions.checkArgument;

// TODO: Auto-generated Javadoc
/**
 * The Class Funcionario.
 *
 * @author geovane.santos
 */
/**
 * The Class Funcionario.
 */
public class Funcionario {
    /** The nome. */
    @NotEmpty(message = "Nome não deve ser vázio.")
    private String nome;

    /** The cargo. */
    @NotBlank(message = "O cargo não deve ser vázio.")
    private String cargo;

    /** The idade. */
    @Min(value = 0, message = "A idade não pode ser negativa.")
    private int idade;

    /** The horario entrada. */
    @Min(value = -1, message = "O horário não deve ser negativo")
    @Max(value = 24, message = "O horário não deve ser maior que 24")
    private double horarioEntrada;

    /** The horario saida. */
    @Min(value = -1, message = "O horário não deve ser negativo")
    @Max(value = 24, message = "O horário não deve ser maior que 24")
    private double horarioSaida;

    /** The data contratacao. */
    @Past(message = "A data de contratação não deve ser maior que a atual")
    private LocalDate dataContratacao;

    /** The cpf. */
    @CPF(message = "O CPF está inválido")
    private String cpf;

    /** The telefone. */
    @NotEmpty(message = "O Telefone nao pode ser nulo")
    private Set<TelefoneDDD> ddd;

    /** The telefone set. */
    @NotBlank(message = "Telefone está invalido.")
    private Set<String> telefoneSet;

    /** The email. */
    @Email(message = "O email está invalido.")
    private String email;

    /**
     * Instantiates a new funcionario.
     *
     * @param nome the nome
     * @param cargo the cargo
     * @param idade the idade
     * @param horarioEntrada the horario entrada
     * @param horarioSaida the horario saida
     * @param dataContratacao the data contratacao
     * @param cpf the cpf
     * @param ddd the ddd
     * @param email the email
     * @param telefoneSet the telefone set
     */
    public Funcionario(@NotEmpty(message = "Nome não deve ser vázio.") String nome, @NotEmpty(message = "O cargo não deve ser vázio.") String cargo,
                       @Min(value = 0, message = "A idade não pode ser negativa.") int idade,
                       @Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioEntrada,
                       @Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioSaida,
                       @Past(message = "A data de contratação não deve ser maior que a atual") LocalDate dataContratacao, @CPF(message = "O CPF está inválido") String cpf,
                       @NotEmpty(message = "O Telefone nao pode ser nulo") @Size(min = 11, max = 11, message = "O telefone está incompleto") Set<TelefoneDDD> ddd,
                       @Email(message = "O email está invalido.") String email, Set<String> telefoneSet) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.dataContratacao = dataContratacao;
        this.cpf = cpf;
        this.ddd = ddd;
        this.email = email;
        this.telefoneSet = telefoneSet;
    }

    /**
     * Gets the telefone.
     *
     * @return the telefone
     */
    public Set<TelefoneDDD> getDDD() {
        return this.ddd;
    }

    /**
     * Sets the telefone.
     *
     * @param telefone the new telefone
     */
    public void setDDD(Set<TelefoneDDD> telefone) {
        this.ddd = telefone;
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
     * Gets the cpf.
     *
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the cpf.
     *
     * @param cpf the new cpf
     */
    public void setCpf(@CPF(message = "O CPF está inválido") String cpf) {
        this.cpf = cpf;
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
    public void setNome(@NotEmpty(message = "Não pode ser vázio") String nome) {
        this.nome = nome;
    }

    /**
     * Gets the cargo.
     *
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Sets the cargo.
     *
     * @param cargo the new cargo
     */
    public void setCargo(@NotEmpty(message = "Não pode ser vázio") String cargo) {
        this.cargo = cargo;
    }

    /**
     * Gets the idade.
     *
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Sets the idade.
     *
     * @param idade the new idade
     */
    public void setIdade(@Min(value = 0, message = "A idade não pode ser negativa.") int idade) {
        checkArgument(idade > 0, "Não existe idade negativa.");
        this.idade = idade;
    }

    /**
     * Gets the horario entrada.
     *
     * @return the horario entrada
     */
    public double getHorarioEntrada() {
        return horarioEntrada;
    }

    /**
     * Sets the horario entrada.
     *
     * @param horarioEntrada the new horario entrada
     */
    public void setHorarioEntrada(@Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioEntrada) {
        checkArgument(horarioEntrada < 0 && horarioEntrada > 24, "O horário deve ser entre 0h a 24h");
        this.horarioEntrada = horarioEntrada;

    }

    /**
     * Gets the horario saida.
     *
     * @return the horario saida
     */
    public double getHorarioSaida() {
        return horarioSaida;
    }

    /**
     * Sets the horario saida.
     *
     * @param horarioSaida the new horario saida
     */
    public void setHorarioSaida(@Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioSaida) {
        checkArgument(horarioEntrada < 0 && horarioEntrada > 24, "O horário deve ser entre 0h a 24h");
        this.horarioSaida = horarioSaida;
    }

    /**
     * Instantiates a new funcionario.
     *
     * @return the int
     */

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
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets the data contratacao.
     *
     * @return the data contratacao
     */
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    /**
     * Sets the data contratacao.
     *
     * @param dataContratacao the new data contratacao
     */
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}
