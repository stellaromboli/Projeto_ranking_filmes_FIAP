package br.com.fiap;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.fiap.interfac.Imagem;

public class Aplicacao {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//criação do Jframe
		JFrame jf = new JFrame();
		jf.setTitle("Fiap Movies");
		jf.setSize(500,400);
		
		// criacao e configuracao da janela principal
		JTabbedPane tabbedPane = new JTabbedPane();//cria a janela com opcoes
		JPanel tabPanePrincipal = new JPanel(); //cria o painel dentro da janela
		tabPanePrincipal.setLayout(new BorderLayout());//define o Layout do painel
		
		//------------------------------------------------------
		//criacao do centro a da plicacao
		JPanel painelCentral = new JPanel();
		painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
		
		//espaco para escrever o titulo 
		painelCentral.add(new JLabel("Titulo"));
		JTextField textTitulo = new JTextField();
		textTitulo.setBounds(0, 0, 0, 0);
		painelCentral.add(textTitulo);
		//espaco para escrever a Sinopse
		painelCentral.add(new JLabel("Sinopse"));
		painelCentral.add(new JTextArea());
		
		//espaco para escolher o genero
		painelCentral.add(new JLabel("Genero"));
		String[] listaGenero = new String[] {"","Terror","Drama","comedia"};
		JComboBox<String> comboBoxGenero = new JComboBox<String>(listaGenero);
		painelCentral.add(comboBoxGenero);
		
		
		tabPanePrincipal.add(painelCentral, BorderLayout.CENTER);
		
		//--------------------------------------------------------------
		
		//Painel da esquerda
		JPanel painelEsquerda = new JPanel();
		Imagem imagem = new Imagem();
		painelEsquerda.add(imagem.inicialize());
		
		tabPanePrincipal.add(painelEsquerda, BorderLayout.LINE_START);
		
		//--------------------------------------------------------------
		
		//Painel da direita
		JPanel paineldireita = new JPanel();
		paineldireita.setLayout(new BoxLayout(paineldireita, BoxLayout.Y_AXIS ));
		
		paineldireita.add(new JLabel("Onde assistir"));
		JRadioButton buttonNetflix = new JRadioButton("Netflix");
		paineldireita.add(buttonNetflix);
		JRadioButton buttonPrime = new JRadioButton("Prime Video");
		paineldireita.add(buttonPrime);
		JRadioButton buttonPirate = new JRadioButton("Pirate Bay");
		paineldireita.add(buttonPirate);
		
		JCheckBox checkAssistido = new JCheckBox("Assistido");
		paineldireita.add(checkAssistido);
		
		tabPanePrincipal.add(paineldireita, BorderLayout.LINE_END);
		
		//---------------------------------------------------------------
		
		tabbedPane.addTab("Cadastro", tabPanePrincipal);//cadasta as abas da janela principal
		tabbedPane.addTab("Lista", new JPanel());
		
		
		
		
		
		
		jf.add(tabbedPane);//adiciona tudo no frame
		
		
	
		
		//set do leyout
		
		//
		
		//jf.add(new JLabel(icon), BorderLayout.LINE_START);
		
		
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
	
}
