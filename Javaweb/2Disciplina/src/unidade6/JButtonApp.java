package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonApp {
     
	public static void main(String[] args) {
		   JFrame frame = new JFrame("Primeira Aplicação");
	       frame.setSize(350, 250);
	       Container cont = frame.getContentPane();
	       cont.setLayout(new FlowLayout());
           cont.add(new JButton("Isto é um Botão!"));
	       frame.setVisible(true);
	
	}
}
