package practice;

import java.util.Scanner;

public class Account1Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
		int num = sc.nextInt();
			
			switch(num) {
				case 1:
				System.out.println("-------------");
				System.out.println("계좌생성");
				System.out.println("-------------");
				System.out.print("계좌번호: ");
				String A = sc.next();
				System.out.print("계좌주: ");
				String B = sc.next();
				System.out.print("초기입금액: ");
				int C = sc.nextInt();
				
			
				Account1 account1 = new Account1(A, B, C);
				break;
				
				case 2:
					System.out.println("-------------");
					System.out.println("계좌목록");
					System.out.println("-------------");
					
			}

	}

}
}