package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Cliente;

public interface ClienteController {
	public void inserirCliente(Cliente cliente);
	public void removerCliente(String cpf);
	public void buscarCliente(Cliente cliente);
	public void buscarCliente(String cpf);
	public void alterarCliente(Cliente cpf);

}
