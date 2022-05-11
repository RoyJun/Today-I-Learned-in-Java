package javaThread;

public class JobThread extends Thread {
	@Override
	public void run() {
		//for문 반복 수행
		for(long i=0; i<200000000; i++) {
			
		}
		//1초 정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		//for문 반복 수행
		for(long i=0; i<200000000; i++) {
			
		}
	}
}
