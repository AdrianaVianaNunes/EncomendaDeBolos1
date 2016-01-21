package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

public class TelaPrincipal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TelaPrincipal dialog = new TelaPrincipal();
			dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TelaPrincipal() {
		setTitle("Encomendas De Bolos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0));
		
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		panel.setLayout(new GridLayout(5, 0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		
		
		JMenu cadMenu = new JMenu("Cadastrar");
        JMenu encMenu = new JMenu("Encomenda");
        JMenu relMenu = new JMenu("Relatório");
        
        menuBar.add(cadMenu);
        menuBar.add(encMenu);
        menuBar.add(relMenu);
        
        JMenuItem funcAction = new JMenuItem("Funcionário");
        JMenuItem clieAction = new JMenuItem("Cliente");
        JMenuItem ingAction = new JMenuItem("Ingrediente");
        
              
        JRadioButtonMenuItem cadAction = new JRadioButtonMenuItem(
                "Radio Button1");
        JRadioButtonMenuItem encAction = new JRadioButtonMenuItem(
                "Radio Button2");
        JRadioButtonMenuItem relAction = new JRadioButtonMenuItem(
                "Radio Button1");
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(cadAction);
        bg.add(encAction);
        bg.add(relAction);
        
        cadMenu.add(funcAction);
        cadMenu.add(clieAction);
        cadMenu.add(ingAction);
        cadMenu.addSeparator();
         
        
  	panel.add(menuBar);
	}
	
}
