package br.com.geovane.prova.Prova1;

public class Endereco {
	private String nome;
	private String bairro;
	private String cidade;
	private String cep;
	private short numero;
	public Endereco(String nome, String bairro, String cidade, String cep, short numero) {
		super();
		this.nome = nome;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Endereco [nome=" + nome + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", numero="
				+ numero + "]";
	}
}
