package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		/*String str="내일부터 어린이날 휴무";
		System.out.println(str);
		char ch=str.charAt(7);
		System.out.println(ch);
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호입력>> ");
		String jumin=scanner.next();
		System.out.println(jumin);
		
		if(jumin.length()==14) {
			
		
		char sex= jumin.charAt(7);
		
		if(sex=='1' || sex=='3') {
			System.out.println("남자이군요");
			
		}else if (sex=='2' || sex=='4') {
			System.out.println("여자이군요");
			
		}else {
			System.out.println("주민번호 입력이 잘못되었군요");
		}
			
			
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}

	}

}
