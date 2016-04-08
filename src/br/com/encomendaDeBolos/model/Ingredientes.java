package br.com.encomendaDeBolos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity

public class Ingredientes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7398040226583932428L;
	@Id
	@SequenceGenerator(name = "ing_seq_gen", sequenceName = "ing_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "ing_seq_gen", strategy = GenerationType.SEQUENCE)
	private int codIngrediente;
	private String nomeIngrediente;
	private String dataValidadeIngre;
	private int quantidadeIngre;
	
	public Ingredientes() {
		// TODO Auto-generated constructor stub
	}

	public Ingredientes(int codIngrediente, String nomeIngrediente, String dataValidadeIngre, int quantidadeIngre) {
		this.codIngrediente = codIngrediente;
		this.nomeIngrediente = nomeIngrediente;
		this.dataValidadeIngre = dataValidadeIngre;
		this.quantidadeIngre = quantidadeIngre;
	}

	public int getCodIngrediente() {
		return codIngrediente;
	}

	public void setCodIngrediente(int codIngrediente) {
		this.codIngrediente = codIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public String getDataValidadeIngre() {
		return dataValidadeIngre;
	}

	public void setDataValidadeIngre(String dataValidadeIngre) {
		this.dataValidadeIngre = dataValidadeIngre;
	}

	public int getQuantidadeIngre() {
		return quantidadeIngre;
	}

	public void setQuantidadeIngre(int quantidadeIngre) {
		this.quantidadeIngre = quantidadeIngre;
	}
}
