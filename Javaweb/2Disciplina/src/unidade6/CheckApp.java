package unidade6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckApp {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Aplicação FlowLayout");
	       frame.setSize(350, 250);
	       Container cont = frame.getContentPane();
	       cont.setLayout(new FlowLayout());
	       cont.add(new JCheckBox("1-Sim"));
	       cont.add(new JCheckBox("2-Não"));
	       frame.setVisible(true);

	}

}
