package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JTFApp {
     
	public static void main(String[] args) {
		   JFrame frame = new JFrame("Primeira Aplicação");
	       frame.setSize(350, 250);
	       Container cont = frame.getContentPane();
	       JPasswordField tf = new JPasswordField("Digite aqui");
	       cont.add(tf, BorderLayout.NORTH);
	       frame.setVisible(true);
	
	}
}
