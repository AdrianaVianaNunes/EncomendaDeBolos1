package br.com.encomendaDeBolos.controller;

import br.com.encomendaDeBolos.model.Ingredientes;



public interface IngredienteController {
	public void inserirIngrediente(Ingredientes ingred);
	public void removerIngrediente(Ingredientes ingred);
	public void buscarIngrediente(Ingredientes ingred);
	public void alterarIngrediente(Ingredientes ingred);
	

}
