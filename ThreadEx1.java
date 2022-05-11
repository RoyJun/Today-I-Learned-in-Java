package javaThread;

import java.awt.Toolkit;

public class ThreadEx1 {

	public static void main(String[] args) {
		/*
		//Runnable 익명 객체 구현
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit	toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=1; i<=5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
					}
				}
				
			}
		});
		*/
		Thread thread = new Thread() {
		@Override
		public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=1; i<=5; i++) {
			toolkit.beep();
		
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
	};
	thread.start();
}
}
	
