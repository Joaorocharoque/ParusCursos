package Exer13;

import org.junit.Test;

public class Exer13 {
      
	@Test
	public void exer13_1() {
		Runnable r1 = () -> System.out.println("Rodando em outra thread");
		Runnable r2 = () -> {
			for (int i = 0; i< 5; i++) {
				System.out.print(i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		new Thread(() -> System.out.println("Outra thread")).start();
	}
}
