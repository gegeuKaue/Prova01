package br.com.geovane.prova.Prova1;

public class Funcionario {
	private String nome;
	private String cargo;
	private int idade;
	private double horarioEntrada;
	private double horarioSaida;
	public Funcionario(String nome, String cargo, int idade, double horarioEntrada, double horarioSaida) {
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
		this.idade = idade;
	}
	public double getHorarioEntrada() {
		return horarioEntrada;
	}
	public void setHorarioEntrada(double horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}
	public double getHorarioSaida() {
		return horarioSaida;
	}
	public void setHorarioSaida(double horarioSaida) {
		this.horarioSaida = horarioSaida;
	}
	
 	
}
