package exer10;

import org.junit.Test;

public class Exer10 {

	@Test
	public  void calcular(Matematica m) {
      System.out.print(m.operar(10,10));
	}
	public  Exer10() {
		calcular((v1, v2) -> v1 + v2 );
		calcular((v1, v2) -> v1 - v2 );
		calcular((v1, v2) -> v1 * v2 );

	
	}
}
