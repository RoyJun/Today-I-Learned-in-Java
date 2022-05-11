package javaThread;

public class YieldEx1 {

	public static void main(String[] args) {
		ThreadJob1_yield tJob1=new ThreadJob1_yield();
		ThreadJob2_yield tJob2=new ThreadJob2_yield();
		// 2개의 스레드 실행
		tJob1.start();
		tJob2.start();
		// 스레드 2초 동안 일시정지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		//첫번째 스레드 양보 모드(tJob2 스레드만 실행)
		tJob1.work=false; 
		//스레드 2초동안 일 시정지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		//첫번째 스레드 다시실행 
		tJob1.work=true; 
		
		//스레드 2초동안 일시정지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		//2 스레드 모두 종료
		tJob1.stop=true;
		tJob2.stop=true;
	}

}
