package javaThread;

public class Calc {

		private int memory;

		public int getMemory() {
			return memory;
		}

		public synchronized     void setMemory(int memory)   {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				System.out.println("�����尡 ����ġ���� ��Ȳ�� �߻��߽��ϴ�.");
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
}
