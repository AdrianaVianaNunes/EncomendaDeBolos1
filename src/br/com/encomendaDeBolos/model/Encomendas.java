package br.com.encomendaDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity

public class Encomendas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6294668236023272339L;
	@Id
	@SequenceGenerator(name = "enc_seq_gen", sequenceName = "enc_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "enc_seq_gen", strategy = GenerationType.SEQUENCE)
	private long idEnc;
	private double valor;
	
	public Encomendas(long idEnc, double valor){
		
		this.idEnc = idEnc;
		this.valor = valor;
	}
	
	public long getIdEnc() {
		return idEnc;
	}

	public void setIdEnc(long idEnc) {
		this.idEnc = idEnc;
	}

	public Encomendas(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
