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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroIngrediente extends JDialog {

	private final JPanel contentPanel = new JPanel();

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
		
		JTextField textFieldNome = new JTextField();
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
		
		JComboBox comboBoxDiaIngre = new JComboBox();
		comboBoxDiaIngre.setBounds(47, 144, 31, 20);
		panel.add(comboBoxDiaIngre);
		
		JLabel lblMs = new JLabel("M\u00EAs");
		lblMs.setBounds(90, 147, 29, 14);
		panel.add(lblMs);
		
		JComboBox comboBox_1mesIngre = new JComboBox();
		comboBox_1mesIngre.setBounds(120, 144, 29, 20);
		panel.add(comboBox_1mesIngre);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(168, 147, 28, 14);
		panel.add(lblAno);
		
		JComboBox comboBox_2anoIngre = new JComboBox();
		comboBox_2anoIngre.setBounds(194, 144, 28, 20);
		panel.add(comboBox_2anoIngre);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(20, 194, 77, 14);
		panel.add(lblQuantidade);
		
		JTextField textFieldQtde = new JTextField();
		textFieldQtde.setBounds(90, 191, 28, 20);
		panel.add(textFieldQtde);
		textFieldQtde.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSalvar.setBounds(8, 279, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		btnEditar.setBounds(107, 279, 89, 23);
		panel.add(btnEditar);
		
		JButton btnCancelar = new JButton("Cancelar");
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
}

	
