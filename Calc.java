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
				
				System.out.println("스레드가 예기치않은 상황이 발생했습니다.");
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
}
