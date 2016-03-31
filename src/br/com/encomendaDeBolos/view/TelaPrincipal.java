package br.com.encomendaDeBolos.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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

import com.sun.prism.Image;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Toolkit;
import java.text.Normalizer.Form;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaPrincipal.class.getResource("/br/com/encomendaDeBolos/imagem/capaTrabalho.jpg")));
		setResizable(false);
		setTitle("Encomendas De Bolos");
		setBounds(100, 100, 450, 412);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(1, 0));
		
		
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 54);
		
		
		JMenu cadMenu = new JMenu("Cadastrar");
        JMenu encMenu = new JMenu("Encomenda");
        JMenu relMenu = new JMenu("Relatório");
        JMenu sairMenu = new JMenu("Sair");
        
        menuBar.add(cadMenu);
        menuBar.add(encMenu);
        menuBar.add(relMenu);
        menuBar.add(sairMenu);
       
        
        JMenuItem funcAction = new JMenuItem("Funcionário");
        funcAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		TelaCadastroFunc func =  new TelaCadastroFunc();
        		func.setVisible(true);
        		setVisible(false);
        	}
        });
        JMenuItem clieAction = new JMenuItem("Cliente");
        clieAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		TelaCadastroCliente cli = new TelaCadastroCliente();
        		cli.setVisible(true);
        		setVisible(false);
        	}
        });
        JMenuItem ingAction = new JMenuItem("Ingrediente");
        ingAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TelaCadastroIngrediente ingre = new TelaCadastroIngrediente();
        		ingre.setVisible(true);
        		setVisible(false);
        	}
        });
        
        JMenuItem encoAction = new JMenuItem("Encomendas");
        encoAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TelaEncomenda encomenda = new TelaEncomenda();
        		encomenda.setVisible(true);
        		setVisible(false);
        	}
        });
        
        JMenuItem relatAction = new JMenuItem("Relatório");
        relatAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		TelaRelatorio relatorio = new TelaRelatorio();
        		relatorio.setVisible(true);
        		setVisible(false);
        	}
        });
        
        JMenuItem sairAction = new JMenuItem("Fechar");
        sairAction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
       
              
              
        JRadioButtonMenuItem cadAction = new JRadioButtonMenuItem(
                "Radio Button1");
        JRadioButtonMenuItem encAction = new JRadioButtonMenuItem(
                "Radio Button2");
        JRadioButtonMenuItem relAction = new JRadioButtonMenuItem(
                "Radio Button1");
        JRadioButtonMenuItem fecharAction = new JRadioButtonMenuItem(
                "Radio Button1");
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(cadAction);
        bg.add(encAction);
        bg.add(relAction);
        bg.add(fecharAction);
        panel.setLayout(null);
        
        cadMenu.add(funcAction);
        cadMenu.add(clieAction);
        cadMenu.add(ingAction);
        cadMenu.addSeparator();
        
        encMenu.add(encoAction);
        encMenu.addSeparator();
        
        relMenu.add(relatAction);
        relMenu.addSeparator();
         
        sairMenu.add(sairAction);
        sairMenu.addSeparator();
        
  	panel.add(menuBar);
  	
  	
  	ImageIcon icon = new ImageIcon("/br/com/encomendaDeBolos/imagem/capaTrabalho1.jpg");
 
  	icon.setImage(icon.getImage().getScaledInstance(100, 100, 200));
 	JLabel labelImagem = new JLabel(new ImageIcon(TelaPrincipal.class.getResource("/br/com/encomendaDeBolos/imagem/capaTrabalho.jpg")));
  	labelImagem.setBounds(0, 56, 434, 324);
  	
  	panel.add(labelImagem);
	}
}
