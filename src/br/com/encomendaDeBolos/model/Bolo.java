package br.com.encomendaDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity

public class Bolo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2902432307931840190L;
	@Id
	@SequenceGenerator(name = "bolo_seq_gen", sequenceName = "bolo_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "bolo_seq_gen", strategy = GenerationType.SEQUENCE)
	private long idBolo;
	private String tipoMassa;
	private String recheio;
	private String cobertura;
	
	public Bolo(long idBolo,String tipoMassa, String recheio, String cobertura) {
		this.idBolo =idBolo;
		this.cobertura = cobertura;
		this.tipoMassa = tipoMassa;
		this.recheio = recheio;
	}
	
	public long getIdBolo() {
		return idBolo;
	}

	public void setIdBolo(long idBolo) {
		this.idBolo = idBolo;
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
