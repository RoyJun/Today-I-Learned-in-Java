package javaThread;

public class ThreadJob1_yield extends Thread {
	public boolean stop=false; //���Ῡ��
	public boolean work=true; //�۾� ���� ����
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadJob1 ���ϴ� ��...");
			}else {
				Thread.yield(); //�ٸ� �����忡�� ������ �纸
			}
		}//while
		System.out.println("ThreadJob1 ����");
	}
}
