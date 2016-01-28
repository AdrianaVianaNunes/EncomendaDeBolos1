package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import java.awt.Color;

public class TelaCadastroFunc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel lblNome;
	private JTextField textFieldCpf;
	private JTextField textFieldCelular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaCadastroFunc dialog = new TelaCadastroFunc();
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
		setTitle("Cadastro de Funcionario");
		setBounds(100, 100, 475, 383);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(5, 2));
		{
			JPanel panelLabelCadastro = new JPanel();
			contentPanel.add(panelLabelCadastro);
			{
				JLabel lblTelaDeCadastro = new JLabel("Tela de Cadastro de Funcionario");
				lblTelaDeCadastro.setFont(new Font("Algerian", Font.PLAIN, 23));
				panelLabelCadastro.add(lblTelaDeCadastro);
			}
		}
		{
			JPanel panelNome = new JPanel();
			contentPanel.add(panelNome);
			{
				lblNome = new JLabel("Nome ");
			}
			{
				textField = new JTextField();
				textField.setColumns(30);
			}
			panelNome.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			panelNome.add(lblNome);
			panelNome.add(textField);
		}
		{
			JPanel panelCpf = new JPanel();
			contentPanel.add(panelCpf);
			panelCpf.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				JLabel lblCpf = new JLabel("CPF ");
				panelCpf.add(lblCpf);
			}
			{
				textFieldCpf = new JTextField();
				panelCpf.add(textFieldCpf);
				textFieldCpf.setColumns(20);
			}
		}
		{
			JPanel panelCel = new JPanel();
			contentPanel.add(panelCel);
			panelCel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				JLabel lblCelular = new JLabel("Celular");
				panelCel.add(lblCelular);
			}
			{
				textFieldCelular = new JTextField();
				panelCel.add(textFieldCelular);
				textFieldCelular.setColumns(19);
			}
		}
		{
			JPanel panelNiver = new JPanel();
			panelNiver.setBorder(new TitledBorder(null, "Data de Nascimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panelNiver);
			panelNiver.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				JLabel lblDia = new JLabel("Dia");
				panelNiver.add(lblDia);
			}
			{
				JComboBox comboBox = new JComboBox();
				panelNiver.add(comboBox);
			}
			{
				JLabel lblMs = new JLabel("M\u00EAs");
				panelNiver.add(lblMs);
			}
			{
				JComboBox comboBox = new JComboBox();
				panelNiver.add(comboBox);
			}
			{
				JLabel lblAno = new JLabel("Ano");
				panelNiver.add(lblAno);
			}
			{
				JComboBox comboBox = new JComboBox();
				panelNiver.add(comboBox);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnVoltar = new JButton("Voltar");
				btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoltar.setForeground(Color.RED);
				buttonPane.add(btnVoltar);
			}
			{
				JButton btEnviar = new JButton("Enviar");
				btEnviar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btEnviar.setActionCommand("OK");
				buttonPane.add(btEnviar);
				getRootPane().setDefaultButton(btEnviar);
			}
			{
				JButton btCancelar = new JButton("Cancelar");
				btCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
				btCancelar.setActionCommand("Cancel");
				buttonPane.add(btCancelar);
			}
		}
	}

}
