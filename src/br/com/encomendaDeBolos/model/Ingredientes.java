package br.com.encomendaDeBolos.model;

import java.util.Date;

public class Ingredientes {
	private int codIngrediente;
	private String nomeIngrediente;
	private Date dataValidadeIngre;
	private int quantidadeIngre;

	public Ingredientes(int codIngrediente, String nomeIngrediente, Date dataValidadeIngre, int quantidadeIngre) {
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

	public Date getDataValidadeIngre() {
		return dataValidadeIngre;
	}

	public void setDataValidadeIngre(Date dataValidadeIngre) {
		this.dataValidadeIngre = dataValidadeIngre;
	}

	public int getQuantidadeIngre() {
		return quantidadeIngre;
	}

	public void setQuantidadeIngre(int quantidadeIngre) {
		this.quantidadeIngre = quantidadeIngre;
	}
}
