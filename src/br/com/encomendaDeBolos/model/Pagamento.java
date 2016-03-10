package br.com.encomendaDeBolos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity

public class Pagamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3695263190702903627L;
	@Id
	@SequenceGenerator(name = "pg_seq_gen", sequenceName = "pg_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "pg_seq_gen", strategy = GenerationType.SEQUENCE)
	
	private long idPg;
	private double valorPago;
	private double valorTotal;
	private String nomeCliente;
	private double valorTroco;
	
	public Pagamento(long idPg, double valorPago, double valorTotal, double valorTroco, String nomeCliente){
		this.idPg = idPg;
		this.valorPago = valorPago;
		this.valorTotal = valorTotal;
		this.valorTroco = valorTroco;
		this.nomeCliente = nomeCliente;
	}

	public long getIdPg() {
		return idPg;
	}

	public void setIdPg(long idPg) {
		this.idPg = idPg;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getValorTroco() {
		return valorTroco;
	}

	public void setValorTroco(double valorTroco) {
		this.valorTroco = valorTroco;
	}


}
