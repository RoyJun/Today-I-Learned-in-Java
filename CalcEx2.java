package javaThread;

public class CalcEx2 {

	public static void main(String[] args) {
		Calc calc = new Calc(); //�ν��Ͻ� ��ü ���� 
		MyThread1 mythread1=new MyThread1();
		mythread1.setCalc(calc);
		mythread1.start();
		MyThread2 mythread2 = new MyThread2();
		mythread2.setCalc(calc);
		mythread2.start();
	}

}
