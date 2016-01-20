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

public class TelaCadastroCliente extends JDialog {
	private JTextField textFieldNome;
	private JTextField textFieldTelef;
	private JTextField textFielddataNasc;
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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel panelGeral = new JPanel();
			panelGeral.setBounds(0, 0, 434, 229);
			getContentPane().add(panelGeral);
			panelGeral.setLayout(null);
			
			JPanel panelLabelCadastro = new JPanel();
			panelLabelCadastro.setBounds(0, 0, 434, 41);
			panelGeral.add(panelLabelCadastro);
			panelLabelCadastro.setLayout(null);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setBounds(10, 13, 72, 23);
			panelLabelCadastro.add(btnVoltar);
			
			JLabel lblCadastroDeCleinetes = new JLabel("Cadastro De Clientes");
			lblCadastroDeCleinetes.setBounds(121, 5, 257, 31);
			lblCadastroDeCleinetes.setFont(new Font("Algerian", Font.PLAIN, 23));
			panelLabelCadastro.add(lblCadastroDeCleinetes);
			
			JPanel panelNome = new JPanel();
			panelNome.setBounds(0, 43, 434, 186);
			panelGeral.add(panelNome);
			panelNome.setLayout(null);
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(10, 41, 46, 14);
			panelNome.add(lblNome);
			
			textFieldNome = new JTextField();
			textFieldNome.setBounds(92, 38, 332, 20);
			panelNome.add(textFieldNome);
			textFieldNome.setColumns(50);
			
			JLabel lblTelefone = new JLabel("Telefone ");
			lblTelefone.setBounds(10, 75, 72, 14);
			panelNome.add(lblTelefone);
			
			textFieldTelef = new JTextField();
			textFieldTelef.setBounds(92, 72, 125, 20);
			panelNome.add(textFieldTelef);
			textFieldTelef.setColumns(10);
			
			JLabel lblDataNascimento = new JLabel("Data Nascimento ");
			lblDataNascimento.setBounds(227, 75, 110, 14);
			panelNome.add(lblDataNascimento);
			
			textFielddataNasc = new JTextField();
			textFielddataNasc.setBounds(336, 72, 88, 20);
			panelNome.add(textFielddataNasc);
			textFielddataNasc.setColumns(10);
			
			JLabel lblEndereo = new JLabel("Endere\u00E7o");
			lblEndereo.setBounds(192, 98, 55, 14);
			panelNome.add(lblEndereo);
			
			JLabel lblRua = new JLabel("Rua ");
			lblRua.setBounds(10, 116, 46, 14);
			panelNome.add(lblRua);
			
			textFieldRua = new JTextField();
			textFieldRua.setBounds(47, 113, 280, 20);
			panelNome.add(textFieldRua);
			textFieldRua.setColumns(10);
			
			JLabel lblNum = new JLabel("N\u00BA");
			lblNum.setBounds(337, 116, 46, 14);
			panelNome.add(lblNum);
			
			textFieldNum = new JTextField();
			textFieldNum.setBounds(369, 113, 55, 20);
			panelNome.add(textFieldNum);
			textFieldNum.setColumns(10);
			
			JLabel lblBairro = new JLabel("Bairro");
			lblBairro.setBounds(10, 141, 46, 14);
			panelNome.add(lblBairro);
			
			textFieldBairro = new JTextField();
			textFieldBairro.setBounds(47, 141, 154, 20);
			panelNome.add(textFieldBairro);
			textFieldBairro.setColumns(10);
			
			JLabel lblComplemento = new JLabel("Complemento");
			lblComplemento.setBounds(213, 144, 91, 14);
			panelNome.add(lblComplemento);
			
			textFieldComplemento = new JTextField();
			textFieldComplemento.setBounds(314, 144, 110, 20);
			panelNome.add(textFieldComplemento);
			textFieldComplemento.setColumns(10);
			
			JLabel lblFuncionario = new JLabel("Funcionario");
			lblFuncionario.setBounds(10, 11, 88, 14);
			panelNome.add(lblFuncionario);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(108, 7, 93, 20);
			panelNome.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 229, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			
			JButton btnEditar = new JButton("Editar");
			btnEditar.setEnabled(false);
			buttonPane.add(btnEditar);
			
			JButton btnSalvar = new JButton("Salvar");
			buttonPane.add(btnSalvar);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
