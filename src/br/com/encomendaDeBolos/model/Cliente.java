package br.com.encomendaDeBolos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7278401765213480046L;
	@Id
	@SequenceGenerator(name = "cli_seq_gen", sequenceName = "cli_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "cli_seq_gen", strategy = GenerationType.SEQUENCE)
	private int codigo;
	private String nome;
	private String telefone;
	@OneToOne
	private Endereco endereco;
	private Date dataNasc;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(int codigo, String nome, String telefone, Endereco endereco, Date dataNasc) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
