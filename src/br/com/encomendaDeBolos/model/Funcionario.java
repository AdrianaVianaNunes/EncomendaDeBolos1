package br.com.encomendaDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Funcionario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2130336222236470988L;
	@Id
	@SequenceGenerator(name = "func_seq_gen", sequenceName = "func_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "func_seq_gen", strategy = GenerationType.SEQUENCE)
	private Long idFunc;
	private String nomeFunc;
	private String rg;
	private String cpf;
	private String telefone;
	@OneToOne(mappedBy = "funcionario")
	private Endereco endereco;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Long idFunc, String nomeFunc, String rg, String cpf,
			String telefone, Endereco endereco) {
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public Long getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(Long idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
