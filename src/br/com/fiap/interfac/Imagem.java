package br.com.fiap.interfac;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagem extends JLabel {

	private static final long serialVersionUID = 1L;
	
	ImageIcon imagem = new ImageIcon(getClass().getResource("images.jpg"));
	
	
	
	public JLabel inicialize() {
		imagem.setImage(imagem.getImage().getScaledInstance(400, 600, 100));
		JLabel label = new JLabel(imagem);
		label.setPreferredSize(new Dimension(400, 600));
		
		return label;
	}
	
}
