package unidade2;

import java.io.FileInputStream;


public class StreamApp {

	public static void byteStream() throws Exception
	{
		FileInputStream entrada = new FileInputStream("C:/Users/joaor/eclipse-workspace/2Disciplin/src/unidade2/dados.txt");
		int contador = 0;
		while ((entrada.read()) != -1)
           contador++;
	 System.out.println("Número de caracteres é:" +contador);
	 entrada.close();
	}
	public static void caracterStream(char letra) throws Exception
	{
		FileInputStream entrada = new FileInputStream("C:/Users/joaor/eclipse-workspace/2Disciplin/src/unidade2/dados.txt");
		int contador = 0;
		int c;
		while ((c = entrada.read()) != -1)
		{
           if (c == letra)
		
		contador++;
		}
	 System.out.println("Número de vezes que a letra informada foi encontrada:" +contador);
	 entrada.close();
	}
	
	public static void main(String[] args) {
		
		try {
		//byteStream();
			System.out.println("Letra a ser encontrada:");
			char letra = (char)System.in.read();
			caracterStream(letra);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
