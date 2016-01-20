package br.com.encomendaDeBolos.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class TelaBuscaCliente {

	private JFrame frmBuscaDeCliente;
	private JTextField textField;
	private JTable table;
	private JTable tabelaBuscaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					TelaBuscaCliente window = new TelaBuscaCliente();
					window.frmBuscaDeCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaBuscaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuscaDeCliente = new JFrame();
		frmBuscaDeCliente.setTitle("Busca de Cliente");
		frmBuscaDeCliente.setBounds(100, 100, 514, 300);
		frmBuscaDeCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuscaDeCliente.getContentPane().setLayout(null);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(10, 11, 89, 23);
		frmBuscaDeCliente.getContentPane().add(botaoVoltar);
		
		JLabel labelBuscaDeCliente = new JLabel("Busca de Cliente");
		labelBuscaDeCliente.setFont(new Font("Algerian", Font.PLAIN, 23));
		labelBuscaDeCliente.setBounds(154, 11, 215, 23);
		frmBuscaDeCliente.getContentPane().add(labelBuscaDeCliente);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente:");
		lblNomeDoCliente.setBounds(10, 57, 119, 14);
		frmBuscaDeCliente.getContentPane().add(lblNomeDoCliente);
		
		textField = new JTextField();
		textField.setBounds(108, 54, 250, 20);
		frmBuscaDeCliente.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton botaoBuscar = new JButton("Buscar");
		botaoBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botaoBuscar.setBounds(388, 53, 83, 23);
		frmBuscaDeCliente.getContentPane().add(botaoBuscar);
		
		JPanel panelListagem = new JPanel();
		panelListagem.setBounds(0, 82, 488, 169);
		frmBuscaDeCliente.getContentPane().add(panelListagem);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panelListagem = new GroupLayout(panelListagem);
		gl_panelListagem.setHorizontalGroup(
			gl_panelListagem.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelListagem.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panelListagem.setVerticalGroup(
			gl_panelListagem.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelListagem.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tabelaBuscaCliente = new JTable();
		tabelaBuscaCliente.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nome", "CPF", "Telefone"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nome", "CPF", "Telefone"
			}
		));
		scrollPane.setViewportView(tabelaBuscaCliente);
		scrollPane.setRowHeaderView(tabelaBuscaCliente);
		panelListagem.setLayout(gl_panelListagem);
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		frmBuscaDeCliente.getContentPane().add(panelListagem);
		
		
		
		
		
		
		
		
		
	}
}
