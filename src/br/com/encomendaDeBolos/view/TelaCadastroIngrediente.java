package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.encomendaDeBolos.controller.IngredienteController;
import br.com.encomendaDeBolos.controller.IngredienteControllerImp;
import br.com.encomendaDeBolos.model.Ingredientes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

public class TelaCadastroIngrediente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNome = new JTextField();
	private JTextField textFieldQtde = new JTextField();
	private JComboBox comboBoxDiaIngre = new JComboBox();
	private JComboBox comboBox_1mesIngre = new JComboBox();
	private JComboBox comboBox_2anoIngre = new JComboBox();
	private String dataVal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaCadastroIngrediente dialog = new TelaCadastroIngrediente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaCadastroIngrediente() {
		setTitle("Tela de Cadastro de Ingredientes");
		setResizable(false);
		setBounds(100, 100, 455, 351);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 86, 417, 210);
	    getContentPane().add(panel);
		panel.setLayout(null);
		
		
	
		textFieldNome.setBounds(70, 75, 267, 20);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblValidade = new JLabel("Validade");
		lblValidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValidade.setBounds(20, 122, 99, 14);
		panel.add(lblValidade);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(20, 147, 29, 14);
		panel.add(lblDia);
		
		comboBoxDiaIngre.setModel(new DefaultComboBoxModel(new String[] {"1", 
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
				"13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		
		
		comboBoxDiaIngre.setBounds(47, 144, 50, 20);
		panel.add(comboBoxDiaIngre);
		
		JLabel lblMs = new JLabel("M\u00EAs");
		lblMs.setBounds(107, 147, 29, 14);
		panel.add(lblMs);
		
		comboBox_1mesIngre.setModel(new DefaultComboBoxModel(new String[] {"Jan",
				"Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set",
				"Out", "Nov", "Dez" }));
		
		
		comboBox_1mesIngre.setBounds(131, 144, 65, 20);
		panel.add(comboBox_1mesIngre);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(206, 147, 28, 14);
		panel.add(lblAno);
		
		comboBox_2anoIngre.setModel(new DefaultComboBoxModel(new String[] {"2016", "2017", "2018", "2019", "", "", "", "", "", ""}));
		
		
		comboBox_2anoIngre.setBounds(234, 144, 65, 20);
		panel.add(comboBox_2anoIngre);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(20, 194, 77, 14);
		panel.add(lblQuantidade);
		
		
		textFieldQtde.setBounds(90, 191, 28, 20);
		panel.add(textFieldQtde);
		textFieldQtde.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salvar();
			}
		});
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalvar.setBounds(8, 279, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		btnEditar.setBounds(107, 279, 89, 23);
		panel.add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnCancelar.setBounds(206, 279, 89, 23);
		panel.add(btnCancelar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal principal = new TelaPrincipal();
				principal.setVisible(true);
				setVisible(false);
			}
		});
		btnVoltar.setForeground(Color.RED);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBounds(306, 279, 89, 23);
		panel.add(btnVoltar);
		
		JPanel panelIngrediente = new JPanel();
		panel.add(panelIngrediente);
		panelIngrediente.setBounds(10, 11, 414, 53);
		panelIngrediente.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCadastroDeIngredientes = new JLabel("Cadastro de Ingredientes ");
		lblCadastroDeIngredientes.setFont(new Font("Algerian", Font.PLAIN, 23));
		panelIngrediente.add(lblCadastroDeIngredientes);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 75, 40, 20);
		panel.add(lblNome);
	}
	
public String preencheData() {
		
		dataVal = (String) comboBoxDiaIngre.getSelectedItem().toString() + "/";
		dataVal = dataVal + (String) comboBox_1mesIngre.getSelectedItem().toString() + "/";
		dataVal = dataVal + (String) comboBox_2anoIngre.getSelectedItem().toString();

		return dataVal;
	}
	
	public void salvar(){
		Ingredientes ingrediente = new Ingredientes();
		IngredienteController ingreCon = new IngredienteControllerImp();
		
		ingrediente.setNomeIngrediente(textFieldNome.getText().toString());
		preencheData();
		ingrediente.setDataValidadeIngre(dataVal);
		ingrediente.setQuantidadeIngre(Integer.parseInt(textFieldQtde.getText().toString()));
		ingreCon.inserirIngrediente(ingrediente);
		limparCampos();
	
	}
	
public void limparCampos(){
		
		textFieldNome.setText("");
		textFieldQtde.setText("");
		comboBoxDiaIngre.setSelectedIndex(0);
		comboBox_1mesIngre.setSelectedIndex(0);
		comboBox_2anoIngre.setSelectedIndex(0);
		
		
	}
}

	
