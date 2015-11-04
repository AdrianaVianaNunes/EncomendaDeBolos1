package br.com.encomendaDeBolos.controller;

public interface Pagamento {
	public void realizaPagementoAVista(double valor);
	public void realizaPagementoCartao(double valor);
}
