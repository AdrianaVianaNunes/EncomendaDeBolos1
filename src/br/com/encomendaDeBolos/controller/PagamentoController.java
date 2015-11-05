package br.com.encomendaDeBolos.controller;

public interface PagamentoController {
	public void realizaPagementoAVista(double valor);
	public void realizaPagementoCartao(double valor);
}
