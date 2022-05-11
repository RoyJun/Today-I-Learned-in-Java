package javaThread;

public class CalcThread extends Thread {
	//생성자
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		int sum=0;
		for(int i=0; i<2000000000; i++) {
			
		}
		System.out.println(getName() + "가 한 작업: " + sum);
	}
}
