package br.com.encomendaDeBolos.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class TelaPagamento {

	private JFrame frmPa;
	private JTextField textFieldTotal;
	private JTextField textFieldNome;
	private JTextField textFieldPago;
	private JTextField textFieldTroco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPagamento window = new TelaPagamento();
					window.frmPa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPagamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPa = new JFrame();
		frmPa.setTitle("Pagamento ");
		frmPa.setBounds(100, 100, 450, 313);
		frmPa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPa.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 38);
		frmPa.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel labelTitulo = new JLabel("Tela Pagamento ");
		labelTitulo.setFont(new Font("Algerian", Font.PLAIN, 23));
		panel.add(labelTitulo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 45, 434, 38);
		frmPa.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel labelNome = new JLabel("Nome:");
		panel_1.add(labelNome);
		
		textFieldNome = new JTextField();
		panel_1.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 94, 434, 37);
		frmPa.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel labelTotal = new JLabel("Valor Total:");
		panel_2.add(labelTotal);
		
		textFieldTotal = new JTextField();
		panel_2.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 142, 434, 37);
		frmPa.getContentPane().add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel labelPago = new JLabel("Valor Pago:");
		panel_3.add(labelPago);
		
		textFieldPago = new JTextField();
		panel_3.add(textFieldPago);
		textFieldPago.setColumns(10);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 190, 434, 38);
		frmPa.getContentPane().add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel labelTroco = new JLabel("Troco:");
		panel_4.add(labelTroco);
		
		textFieldTroco = new JTextField();
		panel_4.add(textFieldTroco);
		textFieldTroco.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 239, 434, 36);
		frmPa.getContentPane().add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton buttonConfirma = new JButton("Confirmar");
		buttonConfirma.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_5.add(buttonConfirma);
		
		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_5.add(buttonCancelar);
		
		JButton buttonVoltar = new JButton("Voltar");
		buttonVoltar.setForeground(Color.RED);
		buttonVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonVoltar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_5.add(buttonVoltar);
	}
}
