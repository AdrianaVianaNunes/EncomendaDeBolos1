package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Bolo;

public interface BoloController {
	public void inserirBolo(Bolo bolo, String cpf);
	public void buscarBolo (Bolo bolo, String cpf);
	public void alterarBolo (Bolo bolo, String cpf);
	public void removerBolo (Bolo bolo, String cpf);

}
