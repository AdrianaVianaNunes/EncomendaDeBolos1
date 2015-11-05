package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Funcionario;

public interface FuncionarioController {
	public void inserirFunc(Funcionario func);
	public void buscarFunc (Funcionario func);
	public void buscarFunc (String cpf);
	public void alterarFunc (Funcionario func);
	public void removerFunc (String cpf);
	

}
