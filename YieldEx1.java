package javaThread;

public class YieldEx1 {

	public static void main(String[] args) {
		ThreadJob1_yield tJob1=new ThreadJob1_yield();
		ThreadJob2_yield tJob2=new ThreadJob2_yield();
		// 2���� ������ ����
		tJob1.start();
		tJob2.start();
		// ������ 2�� ���� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		//ù��° ������ �纸 ���(tJob2 �����常 ����)
		tJob1.work=false; 
		//������ 2�ʵ��� �� ������
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		//ù��° ������ �ٽý��� 
		tJob1.work=true; 
		
		//������ 2�ʵ��� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		
		//2 ������ ��� ����
		tJob1.stop=true;
		tJob2.stop=true;
	}

}
