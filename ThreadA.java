package javaThread;

public class ThreadA extends Thread {
	//생성자
	public ThreadA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(getName() + "ThreadA가 한 작업(1~100까지의 합):" + sum);
	}
}
