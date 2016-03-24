package br.com.encomendaDeBolos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Vendas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7738665549138911878L;
	@Id
	@SequenceGenerator(name = "vendas_seq_gen", sequenceName = "vendas_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "vendas_seq_gen", strategy = GenerationType.SEQUENCE)
	
	private long idVenda;
	private Date dataVenda;
	private Cliente cliente;
	private double valorTotal;
	private int tipoPagamento;
	
	public Vendas(long idVenda,Date dataVenda, Cliente cliente, double valorTotal, int tipoPagamento) {
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.tipoPagamento = tipoPagamento;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(long idVenda) {
		this.idVenda = idVenda;
	}

}
