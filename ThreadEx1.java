package javaThread;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit	toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=1; i<=100; i++) {
					toolkit.beep();
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		thread.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
