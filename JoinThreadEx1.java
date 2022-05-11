package javaThread;

public class JoinThreadEx1 {

	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join(); //joinThread가 종료될때까지 메인 스레드가 일시 정지
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1부터 100까지의 합=" + joinThread.getSum());
		
	}

}
