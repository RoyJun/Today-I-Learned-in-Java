package javaAPI;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		//long time1=System.currentTimeMillis();  õ ���� ����
		long time1=System.nanoTime();
		System.out.println(time1);
		int sum=0;
		for(int i=1; i<=1000000; i++) {
			sum+=i;	
		}
		System.out.println("1���� 100������ ��=" + sum);
	}

}
