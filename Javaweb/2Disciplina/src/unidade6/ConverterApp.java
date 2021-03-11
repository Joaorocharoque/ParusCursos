package unidade6;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterApp {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Celsius Converter");
	       frame.setSize(350, 250);
	       Container cont = frame.getContentPane();
	       cont.setLayout(new GridLayout(2,2));
	       cont.add(new JTextField("0"));
	       cont.add(new JLabel("Celsius"));
	       cont.add(new JButton("Converter"));
	       cont.add(new JLabel("32 Fahrenheit"));
	       frame.setVisible(true);
	}

}
