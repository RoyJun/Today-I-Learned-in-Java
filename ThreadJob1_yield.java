package javaThread;

public class ThreadJob1_yield extends Thread {
	public boolean stop=false; //종료여부
	public boolean work=true; //작업 진행 여부
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadJob1 일하는 중...");
			}else {
				Thread.yield(); //다른 스레드에게 실행을 양보
			}
		}//while
		System.out.println("ThreadJob1 종료");
	}
}
