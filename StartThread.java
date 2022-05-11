package javaThread;

public class StartThread extends Thread {
	//객체필드
	private Thread targetThread;
	//생성자
	public StartThread(Thread target) {
		targetThread=target;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state=targetThread.getState(); //스레드 상태
			System.out.println("현재 스레드 상태:" + state);
			if(state==Thread.State.NEW) { //생성상태라면  => 실행대기상태로 만듬
				targetThread.start();
				
			}
			if(state == Thread.State.TERMINATED) {//스레드가 실행을 마친 상태
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
