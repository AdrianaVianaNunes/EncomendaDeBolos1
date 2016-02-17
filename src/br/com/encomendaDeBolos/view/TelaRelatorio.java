package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaRelatorio extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaRelatorio dialog = new TelaRelatorio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaRelatorio() {
		setTitle("Tela de Relat\u00F3rio");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 414, 42);
			contentPanel.add(panel);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel lblRelatrio = new JLabel("Relat\u00F3rio");
				lblRelatrio.setFont(new Font("Algerian", Font.PLAIN, 23));
				panel.add(lblRelatrio);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Data", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 64, 414, 61);
			contentPanel.add(panel);
			panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				JLabel lblDia = new JLabel("Dia");
				panel.add(lblDia);
			}
			{
				JComboBox comboBox = new JComboBox();
				panel.add(comboBox);
			}
			{
				JLabel lblMs = new JLabel("M\u00EAs");
				panel.add(lblMs);
			}
			{
				JComboBox comboBox = new JComboBox();
				panel.add(comboBox);
			}
			{
				JLabel lblAno = new JLabel("Ano");
				panel.add(lblAno);
			}
			{
				JComboBox comboBox = new JComboBox();
				panel.add(comboBox);
			}

		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 228, 256, 33);
			contentPanel.add(panel);
			{
				JButton Voltar = new JButton("Voltar");
				Voltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						TelaPrincipal principal =new TelaPrincipal();
						principal.setVisible(true);
						setVisible(false);
						
						
					}
				});
				Voltar.setFont(new Font("Tahoma", Font.BOLD, 12));
				Voltar.setForeground(Color.RED);
				panel.add(Voltar);
			}
		}

	}

}
