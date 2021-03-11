package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxApp {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Aplicação FlowLayout");
	       frame.setSize(350, 250);
	       Container cont = frame.getContentPane();
	       cont.setLayout(new FlowLayout());
	       String[] init = {"Brasil", "EUA", "Mexico"};
	       JComboBox<String> combo = new JComboBox<>(init);
	       cont.add(combo);	       
	       frame.setVisible(true);
	}

}
