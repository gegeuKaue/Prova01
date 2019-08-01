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
	
 	
}
