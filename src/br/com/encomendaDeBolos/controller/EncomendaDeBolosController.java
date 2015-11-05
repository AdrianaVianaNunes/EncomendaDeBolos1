package br.com.encomendaDeBolos.controller;

import java.util.Date;

import br.com.encomendaDeBolos.model.Cliente;

public interface EncomendaDeBolosController {
	public void realizaEncomenda(Cliente cliente, Date dataEntrega);
	public void relatorioEntregaDeBolos();
	public void relatorioFluxoDeCaixa();
	

}
