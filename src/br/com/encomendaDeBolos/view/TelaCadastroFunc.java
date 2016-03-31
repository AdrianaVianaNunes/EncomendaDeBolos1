package br.com.encomendaDeBolos.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import br.com.encomendaDeBolos.controller.FuncionarioController;
import br.com.encomendaDeBolos.controller.FuncionarioControllerImp;
import br.com.encomendaDeBolos.model.Endereco;
import br.com.encomendaDeBolos.model.Funcionario;

public class TelaCadastroFunc extends JDialog {

	private JTextField textFieldNome;
	private JTextField textFieldTelef;
	private JTextField textFieldRua;
	private JTextField textFieldNum;
	private JTextField textFieldBairro;
	private JTextField textFieldComplemento;
	private JTextField textFieldCpf;
	

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
	public TelaCadastroFunc() {
		setTitle("Cadastro De Fucionario");
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
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaPrincipal principal = new TelaPrincipal();
					principal.setVisible(true);
					setVisible(false);
				}
			});
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnVoltar.setForeground(Color.RED);
			btnVoltar.setBounds(10, 13, 72, 23);
			panelLabelCadastro.add(btnVoltar);

			JLabel lblCadastroDeFuncionario = new JLabel(
					"Cadastro De Funcionario");
			lblCadastroDeFuncionario.setBounds(121, 5, 342, 31);
			lblCadastroDeFuncionario.setFont(new Font("Algerian", Font.PLAIN,
					23));
			panelLabelCadastro.add(lblCadastroDeFuncionario);

			JPanel panelNome = new JPanel();
			panelNome.setBounds(0, 43, 463, 231);
			panelGeral.add(panelNome);
			panelNome.setLayout(null);

			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(10, 13, 37, 14);
			panelNome.add(lblNome);

			textFieldNome = new JTextField();
			textFieldNome.setBounds(46, 10, 363, 20);
			panelNome.add(textFieldNome);
			textFieldNome.setColumns(50);

			JLabel lblTelefone = new JLabel("Telefone ");
			lblTelefone.setBounds(10, 75, 64, 14);
			panelNome.add(lblTelefone);

			textFieldTelef = new JTextField();
			textFieldTelef.setBounds(67, 72, 124, 20);
			panelNome.add(textFieldTelef);
			textFieldTelef.setColumns(10);

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

			JLabel lblCpf = new JLabel("CPF");
			lblCpf.setBounds(10, 50, 28, 14);
			panelNome.add(lblCpf);
			
			textFieldCpf = new JTextField();
			textFieldCpf.setBounds(42, 44, 171, 20);
			panelNome.add(textFieldCpf);
			textFieldCpf.setColumns(10);
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
			btnSalvar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					salvar();
				}
			});
			btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonPane.add(btnSalvar);
		
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					limparCampos();
				}
			});
			cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
	}

	private void salvar() {
		Funcionario func = new Funcionario();
		Endereco end = new Endereco();
		func.setNomeFunc(textFieldNome.getText().toString());
		func.setCpf(textFieldCpf.getText().toString());
		func.setTelefone((textFieldTelef.getText().toString()));
		FuncionarioController fc = new FuncionarioControllerImp();
		end.setRua(textFieldRua.getText().toString());
		end.setNumero(Integer.parseInt(textFieldNum.getText().toString()));
		end.setBairro(textFieldBairro.getText().toString());
		end.setComplemento(textFieldComplemento.getText().toString());
		func.setEndereco(end);
		fc.inserirFunc(func);
		
        
		System.out.println("Salvo com sucesso!!!");
		limparCampos();
	}
	
	public void limparCampos(){
		
		textFieldNome.setText("");
		textFieldCpf.setText("");
		textFieldTelef.setText("");
		textFieldRua.setText("");
		textFieldNum.setText("");
		textFieldBairro.setText("");
		textFieldComplemento.setText("");
		
		
	}
}
