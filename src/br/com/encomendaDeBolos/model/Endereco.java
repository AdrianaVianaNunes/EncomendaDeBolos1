package br.com.encomendaDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Endereco implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3663914268223151590L;
	@Id
	@SequenceGenerator(name = "end_seq_gen", sequenceName = "end_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "end_seq_gen", strategy = GenerationType.SEQUENCE)
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	@OneToOne
	private Funcionario funcionario;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public Endereco(String rua, int numero, String bairro, String complemento) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
