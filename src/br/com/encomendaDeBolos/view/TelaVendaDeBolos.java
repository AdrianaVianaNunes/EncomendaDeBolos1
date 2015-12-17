package br.com.encomendaDeBolos.view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;


public class TelaVendaDeBolos {

	private JFrame frmVendadDeBolos;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendaDeBolos window = new TelaVendaDeBolos();
					window.frmVendadDeBolos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaVendaDeBolos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVendadDeBolos = new JFrame();
		frmVendadDeBolos.setTitle("Vendas de Bolos");
		frmVendadDeBolos.setBounds(100, 100, 450, 300);
		frmVendadDeBolos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVendadDeBolos.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 45);
		frmVendadDeBolos.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel labelTitulo = new JLabel("Tela Vendas de Bolos");
		labelTitulo.setFont(new Font("Algerian", Font.PLAIN, 23));
		panel.add(labelTitulo);

		JPanel panelNome = new JPanel();
		panelNome.setBounds(0, 45, 434, 38);
		frmVendadDeBolos.getContentPane().add(panelNome);
		panelNome.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel labelNome = new JLabel("Nome:");
		panelNome.add(labelNome);

		textField = new JTextField();
		panelNome.add(textField);
		textField.setColumns(33);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 87, 434, 38);
		frmVendadDeBolos.getContentPane().add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel labelValor = new JLabel("Valor:");
		panel_1.add(labelValor);

		textField_1 = new JTextField();
		textField_1.setText("");
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Data da Venda",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 134, 434, 59);
		frmVendadDeBolos.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JLabel labelDia = new JLabel("Dia:");
		panel_2.add(labelDia);

		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox);

		JLabel labelMes = new JLabel("M\u00EAs:");
		panel_2.add(labelMes);

		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);

		JLabel labelAno = new JLabel("Ano:");
		panel_2.add(labelAno);

		JComboBox comboBox_2 = new JComboBox();
		panel_2.add(comboBox_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Pagamento",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(0, 204, 434, 58);
		frmVendadDeBolos.getContentPane().add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));

		JButton buttonPagamento = new JButton("Pagamento");
		panel_3.add(buttonPagamento);

		JButton buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(buttonCancelar);

		JButton buttonVoltar = new JButton("Voltar");
		panel_3.add(buttonVoltar);

	}

}
