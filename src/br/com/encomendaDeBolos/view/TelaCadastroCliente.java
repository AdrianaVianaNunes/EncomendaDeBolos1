package br.com.encomendaDeBolos.view;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TelaCadastroCliente extends JDialog {

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
			
			JLabel lblCadastroDeCleinetes = new JLabel("Cadastro De Cleinetes");
			lblCadastroDeCleinetes.setFont(new Font("Algerian", Font.PLAIN, 23));
			panelLabelCadastro.add(lblCadastroDeCleinetes);
			
			JPanel panelNome = new JPanel();
			panelNome.setBounds(0, 43, 434, 186);
			panelGeral.add(panelNome);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 229, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
