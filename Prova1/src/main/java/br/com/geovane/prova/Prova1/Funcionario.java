package br.com.geovane.prova.Prova1;

public class Funcionario {
	private String nome;
	private String cargo;
	private short idade;
	private float horarioEntrada;
	private float horarioSaida;
	public Funcionario(String nome, String cargo, short idade, float horarioEntrada, float horarioSaida) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", idade=" + idade + ", horarioEntrada="
				+ horarioEntrada + ", horarioSaida=" + horarioSaida + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + Float.floatToIntBits(horarioEntrada);
		result = prime * result + Float.floatToIntBits(horarioSaida);
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
		if (Float.floatToIntBits(horarioEntrada) != Float.floatToIntBits(other.horarioEntrada))
			return false;
		if (Float.floatToIntBits(horarioSaida) != Float.floatToIntBits(other.horarioSaida))
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
	
 	
}
