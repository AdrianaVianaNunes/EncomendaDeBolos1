package br.com.encomendaDeBolos.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import br.com.encomendaDeBolos.controller.ClienteController;
import br.com.encomendaDeBolos.controller.ClienteControllerImp;
import br.com.encomendaDeBolos.model.Cliente;
import br.com.encomendaDeBolos.model.Endereco;

public class TelaCadastroCliente extends JDialog {
	private JTextField textFieldNome;
	private JTextField textFieldTelef;
	private JTextField textFieldRua;
	private JTextField textFieldNum;
	private JTextField textFieldBairro;
	private JTextField textFieldComplemento;
	private String dataNasc;
	JComboBox comboBoxDia = new JComboBox();
	JComboBox comboBoxMes = new JComboBox();
	JComboBox comboBoxAno = new JComboBox();

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
			comboBoxDia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					preencheData();
				}
			});
			
			
			comboBoxDia.setBounds(247, 136, 28, 20);
			comboBoxDia.setModel(new DefaultComboBoxModel(new String[] { "1",
					"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
					"13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
					"23", "24", "25", "26", "27", "28", "29", "30", "31" }));
			panelNome.add(comboBoxDia);
			
			JLabel lblMs = new JLabel("M\u00EAs");
			lblMs.setBounds(291, 108, 34, 14);
			panelNome.add(lblMs);
			comboBoxMes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					preencheData();
				}
			});
			
			
			comboBoxMes.setBounds(284, 136, 28, 20);
			comboBoxMes.setModel(new DefaultComboBoxModel(new String[] { "Jan",
					"Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set",
					"Out", "Nov", "Dez" }));
			panelNome.add(comboBoxMes);
			
			JLabel lblAno = new JLabel("Ano");
			lblAno.setBounds(332, 108, 46, 14);
			panelNome.add(lblAno);
			comboBoxAno.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					preencheData();
				}
			});
			
			
			comboBoxAno.setBounds(329, 136, 28, 20);
			comboBoxAno.setModel(new DefaultComboBoxModel(new String[] {
					"2016", "2015", "2014", "2013", "2012", "2011", "2010 ",
					"2009", "2008", "2006     ", "2005 ", "2004 ", "2003",
					"2002  ", "2001", "2000", "1999", "1998", "1997", "1996",
					"1995", "1994", "1993", "1992", "1991", "1990", "1989",
					"1988", "1987", "1986", "1985", "1984", "1983", "1982",
					"1981", "1980", "1979", "1978", "1977", "1976", "1975",
					"1974", "1073", "1972", "1971", "1970", "1969", "1968",
					"1967", "1966", "1965", "1964", "1963", "1962", "1961",
					"1960", "1959", "1958", "1957", "1956", "1955", "1954",
					"1953", "1952", "1951", "1950", "1949", "1948", "1947",
					"1946", "1945", "1944", "1943", "1942", "1941", "1940", "",
					"\t\t\t" }));
			panelNome.add(comboBoxAno);
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
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public String preencheData() {
		
		dataNasc = (String) comboBoxDia.getSelectedItem().toString() + "/";
		dataNasc = dataNasc + (String) comboBoxMes.getSelectedItem().toString() + "/";
		dataNasc = dataNasc + (String) comboBoxAno.getSelectedItem().toString();

		return dataNasc;
	}
	
	private void salvar() {
		
		Cliente cli = new Cliente();
		Endereco end = new Endereco();
		cli.setNome(textFieldNome.getText().toString());
		cli.setTelefone((textFieldTelef.getText().toString()));
		cli.setDataNasc(dataNasc);
		ClienteController cliente = new ClienteControllerImp();
		end.setRua(textFieldRua.getText().toString());
		end.setNumero(Integer.parseInt(textFieldNum.getText().toString()));
		end.setBairro(textFieldBairro.getText().toString());
		end.setComplemento(textFieldComplemento.getText().toString());
		cli.setEndereco(end);
		cliente.inserirCliente(cli);

		System.out.println("Salvo com sucesso!!!");
	}
}
