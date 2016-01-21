package br.com.encomendaDeBolos.view;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Color;

public class TelaCadastroCliente extends JDialog {
	private JTextField textFieldNome;
	private JTextField textFieldTelef;
	private JTextField textFieldRua;
	private JTextField textFieldNum;
	private JTextField textFieldBairro;
	private JTextField textFieldComplemento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaCadastroCliente dialog = new TelaCadastroCliente();
			dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaCadastroCliente() {
		setTitle("Cadastro De Cliente");
		setBounds(100, 100, 485, 378);
		getContentPane().setLayout(null);
		{
			JPanel panelGeral = new JPanel();
			panelGeral.setBounds(0, 0, 469, 276);
			getContentPane().add(panelGeral);
			panelGeral.setLayout(null);
			
			JPanel panelLabelCadastro = new JPanel();
			panelLabelCadastro.setBounds(0, 0, 463, 41);
			panelGeral.add(panelLabelCadastro);
			panelLabelCadastro.setLayout(null);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnVoltar.setForeground(Color.RED);
			btnVoltar.setBounds(10, 13, 72, 23);
			panelLabelCadastro.add(btnVoltar);
			
			JLabel lblCadastroDeCleinetes = new JLabel("Cadastro De Clientes");
			lblCadastroDeCleinetes.setBounds(121, 5, 257, 31);
			lblCadastroDeCleinetes.setFont(new Font("Algerian", Font.PLAIN, 23));
			panelLabelCadastro.add(lblCadastroDeCleinetes);
			
			JPanel panelNome = new JPanel();
			panelNome.setBounds(0, 43, 463, 231);
			panelGeral.add(panelNome);
			panelNome.setLayout(null);
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(10, 41, 46, 14);
			panelNome.add(lblNome);
			
			textFieldNome = new JTextField();
			textFieldNome.setBounds(57, 38, 367, 20);
			panelNome.add(textFieldNome);
			textFieldNome.setColumns(50);
			
			JLabel lblTelefone = new JLabel("Telefone ");
			lblTelefone.setBounds(10, 75, 64, 14);
			panelNome.add(lblTelefone);
			
			textFieldTelef = new JTextField();
			textFieldTelef.setBounds(67, 72, 124, 20);
			panelNome.add(textFieldTelef);
			textFieldTelef.setColumns(10);
			
			JLabel lblDataNascimento = new JLabel("Data Nascimento ");
			lblDataNascimento.setBounds(247, 83, 110, 14);
			panelNome.add(lblDataNascimento);
			
			JLabel lblEndereo = new JLabel("Endere\u00E7o");
			lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblEndereo.setBounds(10, 129, 103, 30);
			panelNome.add(lblEndereo);
			
			JLabel lblRua = new JLabel("Rua ");
			lblRua.setBounds(10, 170, 46, 14);
			panelNome.add(lblRua);
			
			textFieldRua = new JTextField();
			textFieldRua.setBounds(57, 167, 280, 20);
			panelNome.add(textFieldRua);
			textFieldRua.setColumns(10);
			
			JLabel lblNum = new JLabel("N\u00BA");
			lblNum.setBounds(347, 167, 46, 14);
			panelNome.add(lblNum);
			
			textFieldNum = new JTextField();
			textFieldNum.setBounds(369, 167, 55, 20);
			panelNome.add(textFieldNum);
			textFieldNum.setColumns(10);
			
			JLabel lblBairro = new JLabel("Bairro");
			lblBairro.setBounds(10, 206, 46, 14);
			panelNome.add(lblBairro);
			
			textFieldBairro = new JTextField();
			textFieldBairro.setBounds(57, 203, 154, 20);
			panelNome.add(textFieldBairro);
			textFieldBairro.setColumns(10);
			
			JLabel lblComplemento = new JLabel("Complemento");
			lblComplemento.setBounds(221, 206, 91, 14);
			panelNome.add(lblComplemento);
			
			textFieldComplemento = new JTextField();
			textFieldComplemento.setBounds(314, 203, 110, 20);
			panelNome.add(textFieldComplemento);
			textFieldComplemento.setColumns(10);
			
			JLabel lblFuncionario = new JLabel("Funcion\u00E1rio");
			lblFuncionario.setBounds(10, 11, 80, 14);
			panelNome.add(lblFuncionario);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(82, 7, 119, 20);
			panelNome.add(comboBox);
			
			JLabel lblDia = new JLabel("Dia");
			lblDia.setBounds(247, 108, 46, 14);
			panelNome.add(lblDia);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setBounds(247, 136, 28, 20);
			panelNome.add(comboBox_1);
			
			JLabel lblMs = new JLabel("M\u00EAs");
			lblMs.setBounds(291, 108, 34, 14);
			panelNome.add(lblMs);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setBounds(284, 136, 28, 20);
			panelNome.add(comboBox_2);
			
			JLabel lblAno = new JLabel("Ano");
			lblAno.setBounds(332, 108, 46, 14);
			panelNome.add(lblAno);
			
			JComboBox comboBox_3 = new JComboBox();
			comboBox_3.setBounds(329, 136, 28, 20);
			panelNome.add(comboBox_3);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 282, 459, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			
			JButton btnEditar = new JButton("Editar");
			btnEditar.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnEditar.setEnabled(false);
			buttonPane.add(btnEditar);
			
			JButton btnSalvar = new JButton("Salvar");
			btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonPane.add(btnSalvar);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
