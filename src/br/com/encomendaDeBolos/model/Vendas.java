package br.com.encomendaDeBolos.model;

import java.util.Date;

public class Vendas {
	private Date dataVenda;
	private Cliente cliente;
	private double valorTotal;
	private int tipoPagamento;
	
	public Vendas(Date dataVenda, Cliente cliente, double valorTotal, int tipoPagamento) {
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

}
