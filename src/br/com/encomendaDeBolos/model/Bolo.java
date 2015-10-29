package br.com.encomendaDeBolos.model;

public class Bolo {
	private String tipoMassa;
	private String recheio;
	private String cobertura;
	
	public Bolo(String tipoMassa, String recheio, String cobertura) {
		this.cobertura = cobertura;
		this.tipoMassa = tipoMassa;
		this.recheio = recheio;
	}
	
	public String getTipoMassa() {
		return tipoMassa;
		//olha
	}
	public void setTipoMassa(String tipoMassa) {
		this.tipoMassa = tipoMassa;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

}
