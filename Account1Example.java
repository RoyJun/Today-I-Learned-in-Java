package practice;

import java.util.Scanner;

public class Account1Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("------------------------------------------");
		System.out.print("����> ");
		int num = sc.nextInt();
			
			switch(num) {
				case 1:
				System.out.println("-------------");
				System.out.println("���»���");
				System.out.println("-------------");
				System.out.print("���¹�ȣ: ");
				String A = sc.next();
				System.out.print("������: ");
				String B = sc.next();
				System.out.print("�ʱ��Աݾ�: ");
				int C = sc.nextInt();
				
			
				Account1 account1 = new Account1(A, B, C);
				break;
				
				case 2:
					System.out.println("-------------");
					System.out.println("���¸��");
					System.out.println("-------------");
					
			}

	}

}
}