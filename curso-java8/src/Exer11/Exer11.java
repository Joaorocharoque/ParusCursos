package Exer11;

import org.junit.Test;

import exer10.Matematica;

public class Exer11 {

	@Test
	public  void calcular(Matematica m) {
      System.out.print(m.operar(10,10));
	
	}
	@Test
	public void exer11() {
		calcular((v1, v2) -> {
			return v1 + v2;
		});
		calcular((v1, v2) -> {
			System.out.println("Corpo do lambda");
			return v1 - v2;
		});
	}
}
