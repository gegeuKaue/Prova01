package br.com.geovane.prova.Prova1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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

    private Calendar dataContratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        }else
            throw new IllegalArgumentException("Não existe idade negativo");
        
    }

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

    public Funcionario(String nome, String cargo, int idade, double horarioEntrada, double horarioSaida, Calendar dataContratacao) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.setHorarioEntrada(horarioEntrada);
        this.setHorarioSaida(horarioSaida);
        this.setIdade(idade);
        this.dataContratacao = dataContratacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((dataContratacao == null) ? 0 : dataContratacao.hashCode());
        long temp;
        temp = Double.doubleToLongBits(horarioEntrada);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(horarioSaida);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + idade;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (dataContratacao == null) {
            if (other.dataContratacao != null)
                return false;
        } else if (!dataContratacao.equals(other.dataContratacao))
            return false;
        if (Double.doubleToLongBits(horarioEntrada) != Double.doubleToLongBits(other.horarioEntrada))
            return false;
        if (Double.doubleToLongBits(horarioSaida) != Double.doubleToLongBits(other.horarioSaida))
            return false;
        if (idade != other.idade)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        // FORMATACAO DA DATA
        SimpleDateFormat formatacaoData = new SimpleDateFormat("dd/MM/yyyy");
        formatacaoData.setCalendar(dataContratacao);

        StringBuilder builder = new StringBuilder();

        // NOME
        builder.append("\tNome \t");
        builder.append(this.nome);
        builder.append("\n");
        // Cargo
        builder.append("\tCargo \t");
        builder.append(this.cargo);
        builder.append("\n");
        // IDADE
        builder.append("\tIdade \t");
        builder.append(this.idade);
        builder.append("\n");
        // HORÁRIO
        builder.append("\tHorário\t");
        builder.append(this.horarioEntrada);
        builder.append("h ás ");
        builder.append(this.horarioSaida);
        builder.append("h");
        //DATA
        builder.append("\n\tData de Contratacao:\t");
        builder.append(formatacaoData.format(dataContratacao.getTime()));

        return builder.toString();
    }

    public Calendar getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
}
