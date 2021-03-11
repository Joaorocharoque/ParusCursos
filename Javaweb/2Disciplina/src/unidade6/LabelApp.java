package unidade6;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelApp {

	public static void main(String[] args) {
		  JFrame frame = new JFrame("Primeira Aplicação");
	       frame.setSize(350, 250);
	     Container cont = frame.getContentPane();
	     cont.setLayout(new GridLayout(2,1));
	     cont.add(new JLabel("Isto é um rotulo!"));
	     frame.setVisible(true);
		
	}

}
