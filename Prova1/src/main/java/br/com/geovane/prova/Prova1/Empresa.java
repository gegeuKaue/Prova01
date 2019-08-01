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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((listaFuncionario == null) ? 0 : listaFuncionario.hashCode());
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
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (listaFuncionario == null) {
			if (other.listaFuncionario != null)
				return false;
		} else if (!listaFuncionario.equals(other.listaFuncionario))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
