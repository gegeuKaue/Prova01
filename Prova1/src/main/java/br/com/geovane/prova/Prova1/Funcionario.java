package br.com.geovane.prova.Prova1;

import java.time.LocalDate;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
    private String nome;

    /** The cargo. */
    private String cargo;

    /** The idade. */
    private int idade;

    /** The horario entrada. */
    private double horarioEntrada;

    /** The horario saida. */
    private double horarioSaida;

    /** The data contratacao. */
    private LocalDate dataContratacao;

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
    public void setCargo(String cargo) {
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
    public void setIdade(int idade) {
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
    public void setHorarioEntrada(double horarioEntrada) {
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
    public void setHorarioSaida(double horarioSaida) {
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
     */
    public Funcionario(String nome, String cargo, int idade, double horarioEntrada, double horarioSaida, LocalDate dataContratacao) {

        this.nome = nome;
        this.cargo = cargo;
        this.setHorarioEntrada(horarioEntrada);
        this.setHorarioSaida(horarioSaida);
        this.setIdade(idade);
        this.dataContratacao = dataContratacao;
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
