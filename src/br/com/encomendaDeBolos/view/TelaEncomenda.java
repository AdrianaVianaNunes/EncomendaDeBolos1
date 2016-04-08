package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

import br.com.encomendaDeBolos.controller.EncomendaDeBolosController;
import br.com.encomendaDeBolos.controller.EncomendaDeBolosControllerImp;
import br.com.encomendaDeBolos.model.Cliente;
import br.com.encomendaDeBolos.model.Encomendas;

import javax.swing.ButtonGroup;

public class TelaEncomenda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldCliente;
	private JRadioButton rdbtnMassaBranca;
	private JRadioButton rdbtnMassaDeChocolate;
	private JCheckBox chckbxLeites;
	private JCheckBox chckbxBeijinho;
	private JCheckBox chckbxBrigadeiro;
	private JCheckBox chckbxChocolate;
	private JCheckBox chckbxFrutas;
	private JRadioButton rdbtnLeites;
	private JRadioButton rdbtnBrigadeiro;
	private JTextArea textAreaObs = new JTextArea();
	private JComboBox comboBoxFrutas = new JComboBox();
	private String recheio;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	

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
			textFieldCliente = new JTextField();
			textFieldCliente.setEditable(false);
			textFieldCliente.setBounds(127, 37, 169, 20);
			contentPanel.add(textFieldCliente);
			textFieldCliente.setColumns(10);
		}
		{
			JLabel lblTipoDaMassa = new JLabel("Tipo da Massa");
			lblTipoDaMassa.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblTipoDaMassa.setBounds(21, 69, 88, 14);
			contentPanel.add(lblTipoDaMassa);
		}

		rdbtnMassaBranca = new JRadioButton("Massa Branca");
		buttonGroup.add(rdbtnMassaBranca);
	
		rdbtnMassaBranca.setBounds(0, 90, 109, 23);
		contentPanel.add(rdbtnMassaBranca);

		 rdbtnMassaDeChocolate = new JRadioButton(
				"Massa de Chocolate");
		buttonGroup.add(rdbtnMassaDeChocolate);
		rdbtnMassaDeChocolate.setBounds(0, 111, 149, 23);
		contentPanel.add(rdbtnMassaDeChocolate);

		JLabel lblRecheio = new JLabel("Recheio");
		lblRecheio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecheio.setBounds(176, 68, 46, 14);
		contentPanel.add(lblRecheio);

		chckbxLeites = new JCheckBox("4 Leites");
		chckbxLeites.setBounds(151, 94, 71, 14);
		contentPanel.add(chckbxLeites);

	    chckbxBeijinho = new JCheckBox("Beijinho");
		chckbxBeijinho.setBounds(151, 111, 97, 23);
		contentPanel.add(chckbxBeijinho);

	    chckbxBrigadeiro = new JCheckBox("Brigadeiro");
		chckbxBrigadeiro.setBounds(151, 137, 97, 23);
		contentPanel.add(chckbxBrigadeiro);

	    chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setBounds(151, 163, 97, 23);
		contentPanel.add(chckbxChocolate);

	    chckbxFrutas = new JCheckBox("Frutas");
		chckbxFrutas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checarFrutas();
			}
		});
		
		chckbxFrutas.setBounds(151, 189, 71, 23);
		contentPanel.add(chckbxFrutas);
		comboBoxFrutas.setEnabled(false);

		comboBoxFrutas.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Abacaxi", "Ameixa", "Morango", "P\u00EAssego", ""}));
		comboBoxFrutas.setBounds(221, 193, 88, 20);
		contentPanel.add(comboBoxFrutas);

		JLabel lblCobertura = new JLabel("Cobertura");
		lblCobertura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCobertura.setBounds(319, 69, 71, 14);
		contentPanel.add(lblCobertura);

	    rdbtnBrigadeiro = new JRadioButton("Brigadeiro");
		buttonGroup_1.add(rdbtnBrigadeiro);
		rdbtnBrigadeiro.setBounds(319, 90, 109, 23);
		contentPanel.add(rdbtnBrigadeiro);

	    rdbtnLeites = new JRadioButton("4 Leites");
		buttonGroup_1.add(rdbtnLeites);
		rdbtnLeites.setBounds(319, 111, 109, 23);
		contentPanel.add(rdbtnLeites);

		JLabel lblObservaesDaCobertura = new JLabel("Observa\u00E7\u00F5es");
		lblObservaesDaCobertura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblObservaesDaCobertura.setBounds(329, 137, 99, 14);
		contentPanel.add(lblObservaesDaCobertura);

		textAreaObs.setBounds(319, 162, 95, 50);
		contentPanel.add(textAreaObs);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnSalvar = new JButton("Salvar");
				btnSalvar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						salvar();
					}
				});
				btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSalvar.setActionCommand("OK");
				buttonPane.add(btnSalvar);
				getRootPane().setDefaultButton(btnSalvar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						limparCampos();
					}
				});
				btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	public void checarFrutas(){
		if (chckbxFrutas.isSelected()) {
			comboBoxFrutas.setEnabled(true);
		}
	}

	public void salvar() {
		Encomendas enc = new Encomendas();
		EncomendaDeBolosController encCon = new EncomendaDeBolosControllerImp();
       
		if (rdbtnMassaBranca.isSelected() == true) {
			enc.setTipoMassa("Massa branca");
		}
		if (rdbtnMassaDeChocolate.isSelected() == true) {
			enc.setTipoMassa("Massa de chocolate");
		}
		if (chckbxBeijinho.isSelected() == true) {

			recheio = "Quatro leites";
			

		}
		if (chckbxBrigadeiro.isSelected() == true) {
			recheio = "Brigadeiro" + recheio;
		}
		if (chckbxLeites.isSelected() == true) {
			recheio = "Beijinho" + recheio;
		}
		if (chckbxChocolate.isSelected() == true) {
			recheio = "Chocolate" + recheio;
		}
		if (chckbxFrutas.isSelected() == true
				&& comboBoxFrutas.isShowing() == true && comboBoxFrutas.getSelectedIndex()!=0) {
			chckbxFrutas.setEnabled(true);
			recheio = comboBoxFrutas.getSelectedItem().toString() + recheio;
		}
		if (rdbtnBrigadeiro.isSelected()==true) {
			enc.setCobertura("Brigadeiro");
		}
		else if (rdbtnLeites.isSelected()==true) {
			enc.setCobertura("Quatro leites");
		}
		else{
			enc.setCobertura(textAreaObs.getText().toString());
		}
		
		//encCon.realizaEncomenda(cliente, dataEntrega);

	}
	  public void limparCampos(){
		rdbtnBrigadeiro.setSelected(false);
		rdbtnLeites.setSelected(false);
		rdbtnMassaBranca.setSelected(false);
		rdbtnMassaDeChocolate.setSelected(false);
		chckbxBeijinho.setSelected(false);
		chckbxBrigadeiro.setSelected(false);
		chckbxChocolate.setSelected(false);
		chckbxFrutas.setSelected(false);
		chckbxLeites.setSelected(false);
		textAreaObs.setText("");
		comboBoxFrutas.setSelectedIndex(0);
		
	}
}
