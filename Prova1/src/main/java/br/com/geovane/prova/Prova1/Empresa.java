package br.com.geovane.prova.Prova1;

import java.util.ArrayList;

public class Empresa {
	private String nome;
	private String email;
	private String cnpj;
	private Endereco endereco;
	private ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	public Empresa(String nome, String email, String cnpj, String nomeEndereco, String bairro, String cidade,
			String cep, short numero) {
		super();
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		endereco = new Endereco(nomeEndereco, bairro, cidade, cep, numero);
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", email=" + email + ", cnpj=" + cnpj + ", \nendereco=" + endereco
				+ "\n, listaAluno=" + listaFuncionario + "]";
	}
	public  void addFuncionario(Funcionario funcionario) {
		this.listaFuncionario.add(funcionario);
	}

	public void mostrarFuncionario() {
		for(Funcionario funcionario : this.listaFuncionario)
			System.out.println(funcionario);	
	}

}
