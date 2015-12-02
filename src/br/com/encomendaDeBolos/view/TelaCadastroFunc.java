package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;

public class TelaCadastroFunc extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel lblNome;
	private JTextField textFieldCpf;
	private JTextField textFieldCelular;
	private JTextField textFieldNiver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaCadastroFunc dialog = new TelaCadastroFunc();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
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
		setBounds(100, 100, 450, 300);
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
			contentPanel.add(panelNiver);
			panelNiver.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				JLabel lblDataNascimento = new JLabel("Data Nascimento");
				panelNiver.add(lblDataNascimento);
			}
			{
				textFieldNiver = new JTextField();
				panelNiver.add(textFieldNiver);
				textFieldNiver.setColumns(13);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btEnviar = new JButton("Enviar");
				btEnviar.setActionCommand("OK");
				buttonPane.add(btEnviar);
				getRootPane().setDefaultButton(btEnviar);
			}
			{
				JButton btCancelar = new JButton("Cancelar");
				btCancelar.setActionCommand("Cancel");
				buttonPane.add(btCancelar);
			}
		}
	}

}
