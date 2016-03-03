package br.com.encomendaDeBolos.model;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;

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
