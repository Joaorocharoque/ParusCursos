package Exer12;

import org.junit.Test;

import exer10.Matematica;

public class Exer12 {


	@Test
	public  void calcular(Matematica m) {
      System.out.print(m.operar(10,10));

	}
	
	public void exer12() {
		calcular((Integer v1, Integer v2) -> {
			return v1/v2;
		});

		calcular((Integer v1, Integer v2) -> {
			System.out.println("Corpo do lamba");
			return v1/v2;
		});
		calcular((Integer v1, Integer v2) -> v1 * v2);
		
	}
}
