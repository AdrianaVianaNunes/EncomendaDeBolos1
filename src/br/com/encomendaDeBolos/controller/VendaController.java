package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Vendas;

public interface VendaController {
	public void inserirVenda(Vendas venda);
	public void buscarVenda (Vendas venda);
	public void buscarVenda (String cpf);
	public void removerVenda (Vendas venda);

}
