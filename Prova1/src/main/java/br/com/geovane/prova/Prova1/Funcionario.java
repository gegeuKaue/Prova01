package br.com.geovane.prova.Prova1;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.br.CPF;

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
    @NotEmpty(message = "O cargo não deve ser vázio.")
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
        if (idade > 0) {
            this.idade = idade;
        } else
            throw new IllegalArgumentException("Não existe idade negativo");

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
        if (horarioEntrada >= 0 && horarioEntrada < 24) {
            this.horarioEntrada = horarioEntrada;
        } else
            throw new IllegalArgumentException("O horário deve ser entre 0h a 24h");
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
        if (horarioSaida >= 0 && horarioSaida < 24) {
            this.horarioSaida = horarioSaida;
        } else
            throw new IllegalArgumentException("O horário deve ser entre 0h a 24h");
    }

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
     */
    public Funcionario(@NotEmpty(message = "Nome não deve ser vázio.") String nome, @NotEmpty(message = "O cargo não deve ser vázio.") String cargo,
                       @Min(value = 0, message = "A idade não pode ser negativa.") int idade,
                       @Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioEntrada,
                       @Min(value = -1, message = "O horário não deve ser negativo") @Max(value = 24, message = "O horário não deve ser maior que 24") double horarioSaida,
                       @Past(message = "A data de contratação não deve ser maior que a atual") LocalDate dataContratacao, @CPF(message = "O CPF está inválido") String cpf) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.dataContratacao = dataContratacao;
        this.cpf = cpf;
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
