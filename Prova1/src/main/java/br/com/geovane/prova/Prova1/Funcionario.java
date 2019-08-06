package br.com.geovane.prova.Prova1;

// TODO: Auto-generated Javadoc
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

	/**
	 * Instantiates a new funcionario.
	 *
	 * @param nome the nome
	 * @param cargo the cargo
	 * @param idade the idade
	 * @param horarioEntrada the horario entrada
	 * @param horarioSaida the horario saida
	 */
	public Funcionario(String nome, String cargo, int idade, double horarioEntrada, double horarioSaida) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {

		return "\tNome: \t" + this.nome + "\n\t" + "Cargo: \t" + this.cargo + "\n" + "\tIdade: \t" + this.idade + "\n" + "\tHorário: "
				+ this.horarioEntrada + "h ás " + this.horarioSaida + "h";
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
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

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
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
	public void setHorarioEntrada(double horarioEntrada) {
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
	public void setHorarioSaida(double horarioSaida) {
		this.horarioSaida = horarioSaida;
	}

}
