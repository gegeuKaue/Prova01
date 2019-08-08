package br.com.geovane.prova.Prova1;

import java.util.ArrayList;

/**
 * The Class Empresa.
 *
 * @author geovane.santos
 */
public class Empresa {

	/** The nome. */
	private String nome;

	/** The email. */
	private String email;

	/** The cnpj. */
	private String cnpj;

	/** The endereco. */
	private Endereco endereco;

	/** The lista funcionario. */
	private ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	/**
	 * Instantiates a new empresa.
	 *
	 * @param nome         the nome
	 * @param email        the email
	 * @param cnpj         the cnpj
	 * @param nomeEndereco the nome endereco
	 * @param bairro       the bairro
	 * @param cidade       the cidade
	 * @param cep          the cep
	 * @param numero       the numero
	 */
	public Empresa(String nome, String email, String cnpj, String nomeEndereco, String bairro, String cidade,
			String cep, int numero) {
		
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		endereco = new Endereco(nomeEndereco, bairro, cidade, cep, numero);
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the cnpj.
	 *
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Sets the cnpj.
	 *
	 * @param cnpj the new cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		// NOME
		builder.append("\t");
		builder.append(this.nome);
		builder.append("\n");
		// EMAIL
		builder.append("\tEmail:\t");
		builder.append(this.email);
		builder.append("\n");
		// CNPJ
		builder.append("\tCNPJ:\t");
		builder.append(this.cnpj);
		builder.append("\n");
		// Endereco
		builder.append("\tEndereço:\t");
		builder.append("\n");
		builder.append(this.endereco);
		return builder.toString();
	}

	/**
	 * Adds the funcionario.
	 *
	 * @param funcionario the funcionario
	 */
	public void addFuncionario(Funcionario funcionario) {
		this.listaFuncionario.add(funcionario);
	}

	/**
	 * Mostrar funcionario.
	 */
	public void mostrarFuncionario() {
		if (this.listaFuncionario.size() == 0) {
			System.out.println("Não tem funcionario cadastrado!!!");
			return;
		}
		for (Funcionario funcionario : this.listaFuncionario)
			System.out.println(funcionario + "\n");
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
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((listaFuncionario == null) ? 0 : listaFuncionario.hashCode());
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

	/**
	 * Gets the funcionario.
	 *
	 * @param index the index
	 * @return the funcionario
	 */
	public Funcionario getFuncionario(int index) {
		return listaFuncionario.get(index);
	}

	/**
	 * Gets the list funcionario.
	 *
	 * @return the list funcionario
	 */
	public ArrayList<Funcionario> getListFuncionario() {

		return listaFuncionario;
	}

	/**
	 * Sets the endereco.
	 *
	 * @param endereco the new endereco
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * Gets the endereco.
	 *
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return this.endereco;
	}

}
