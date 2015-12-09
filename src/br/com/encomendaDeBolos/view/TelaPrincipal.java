package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class TelaPrincipal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaPrincipal dialog = new TelaPrincipal();
			dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaPrincipal() {
		setTitle("Encomendas De Bolos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0));
		
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		panel.setLayout(new GridLayout(5, 0, 0, 0));
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
		panel.add(btnCadastrarFuncionario);
		
		JButton btnCdCliente = new JButton("Cadastrar Cliente");
		panel.add(btnCdCliente);
		
		JButton btnCdIngred = new JButton("Cadastro de Ingrediente");
		panel.add(btnCdIngred);
		
		JButton btnEncomenda = new JButton("Encomenda");
		panel.add(btnEncomenda);
		
		JButton btnRelatorio = new JButton("Relatorio");
		panel.add(btnRelatorio);
	}
	
}
