package unidade2;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Formatter saida =new Formatter(System.out);
		System.out.println("informe a nota 1");
		float n1 = entrada.nextFloat();
		System.out.println("informe a nota 2");
		float n2 = entrada.nextFloat();
		System.out.println("informe a nota 3");
		float n3 = entrada.nextFloat();
		System.out.println("informe a nota 4");
		float n4 = entrada.nextFloat();
		float media = (n1+n2+n3+n4)/4;
		saida.format("media= %.2f",media);
		entrada.close();
		saida.close();
	}

}
