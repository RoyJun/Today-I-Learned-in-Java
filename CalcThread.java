package javaThread;

public class CalcThread extends Thread {
	//������
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		int sum=0;
		for(int i=0; i<2000000000; i++) {
			
		}
		System.out.println(getName() + "�� �� �۾�: " + sum);
	}
}
