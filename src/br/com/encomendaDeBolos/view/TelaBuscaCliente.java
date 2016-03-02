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
import java.awt.Color;

public class TelaBuscaCliente {

	private JFrame frmBuscaDeCliente;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		botaoVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		botaoVoltar.setForeground(Color.RED);
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
		
		
		
		String []vetColunas = new String[] {
				"Nome", "CPF", "Telefone"
			};
		String [][]matTabela = new String [3][3]; 
		
		table_2 = new JTable(matTabela,vetColunas);
		table_2.setBounds(28, 129, 443, 102);
		
		JScrollPane scroll = new JScrollPane(table_2);
		scroll.setBounds(28, 129, 443, 102);
		
		
		frmBuscaDeCliente.getContentPane().add(scroll);
		
		
		
		
		
		
		
	}
}
