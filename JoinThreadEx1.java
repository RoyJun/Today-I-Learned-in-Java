package javaThread;

public class JoinThreadEx1 {

	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join(); //joinThread�� ����ɶ����� ���� �����尡 �Ͻ� ����
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("1���� 100������ ��=" + joinThread.getSum());
		
	}

}
