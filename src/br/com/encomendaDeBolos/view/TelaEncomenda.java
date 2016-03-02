package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEncomenda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaEncomenda dialog = new TelaEncomenda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaEncomenda() {
		setTitle("Tela de Encomenda");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEncomendaDeBolos = new JLabel("Encomenda de Bolos");
			lblEncomendaDeBolos.setFont(new Font("Algerian", Font.PLAIN, 23));
			lblEncomendaDeBolos.setBounds(117, 11, 248, 23);
			contentPanel.add(lblEncomendaDeBolos);
		}
		{
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaPrincipal principal = new TelaPrincipal();
					principal.setVisible(true);
					setVisible(false);
				}
			});
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnVoltar.setForeground(Color.RED);
			btnVoltar.setBounds(10, 11, 71, 23);
			contentPanel.add(btnVoltar);
		}
		{
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(127, 37, 169, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblTipoDaMassa = new JLabel("Tipo da Massa");
			lblTipoDaMassa.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTipoDaMassa.setBounds(21, 69, 88, 14);
			contentPanel.add(lblTipoDaMassa);
		}
		
		JRadioButton rdbtnMassaBranca = new JRadioButton("Massa Branca");
		rdbtnMassaBranca.setBounds(0, 90, 109, 23);
		contentPanel.add(rdbtnMassaBranca);
		
		JRadioButton rdbtnMassaDeChocolate = new JRadioButton("Massa de Chocolate");
		rdbtnMassaDeChocolate.setBounds(0, 111, 149, 23);
		contentPanel.add(rdbtnMassaDeChocolate);
		
		JLabel lblRecheio = new JLabel("Recheio");
		lblRecheio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecheio.setBounds(176, 68, 46, 14);
		contentPanel.add(lblRecheio);
		
		JCheckBox chckbxLeites = new JCheckBox("4 Leites");
		chckbxLeites.setBounds(151, 94, 71, 14);
		contentPanel.add(chckbxLeites);
		
		JCheckBox chckbxBeijinho = new JCheckBox("Beijinho");
		chckbxBeijinho.setBounds(151, 111, 97, 23);
		contentPanel.add(chckbxBeijinho);
		
		JCheckBox chckbxBrigadeiro = new JCheckBox("Brigadeiro");
		chckbxBrigadeiro.setBounds(151, 137, 97, 23);
		contentPanel.add(chckbxBrigadeiro);
		
		JCheckBox chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setBounds(151, 163, 97, 23);
		contentPanel.add(chckbxChocolate);
		
		JCheckBox chckbxFrutas = new JCheckBox("Frutas");
		chckbxFrutas.setBounds(151, 189, 71, 23);
		contentPanel.add(chckbxFrutas);
		
		JComboBox comboBoxFrutas = new JComboBox();
		comboBoxFrutas.setBounds(221, 193, 88, 20);
		contentPanel.add(comboBoxFrutas);
		
		JLabel lblCobertura = new JLabel("Cobertura");
		lblCobertura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCobertura.setBounds(319, 69, 71, 14);
		contentPanel.add(lblCobertura);
		
		JRadioButton rdbtnBrigadeiro = new JRadioButton("Brigadeiro");
		rdbtnBrigadeiro.setBounds(319, 90, 109, 23);
		contentPanel.add(rdbtnBrigadeiro);
		
		JRadioButton rdbtnLeites = new JRadioButton("4 Leites");
		rdbtnLeites.setBounds(319, 111, 109, 23);
		contentPanel.add(rdbtnLeites);
		
		JLabel lblObservaesDaCobertura = new JLabel("Observa\u00E7\u00F5es");
		lblObservaesDaCobertura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObservaesDaCobertura.setBounds(329, 137, 99, 14);
		contentPanel.add(lblObservaesDaCobertura);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(319, 162, 95, 50);
		contentPanel.add(textArea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSalvar.setActionCommand("OK");
				buttonPane.add(btnSalvar);
				getRootPane().setDefaultButton(btnSalvar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
