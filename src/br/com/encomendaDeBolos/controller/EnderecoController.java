package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Endereco;

public interface EnderecoController {
	public void inserirEndereco(Endereco end);
	public void removerEndereco(Endereco end);
	public void buscarEndereco(Endereco end);
	public void alterarEndereco(Endereco end);
	

}
