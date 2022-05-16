package javaSpecial;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("hope", "12345");
		map.put("chan", "11111");
		map.put("yount", "22222");
		map.put("son", "77777");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디>> ");
			String id=sc.next();
			System.out.print("비밀번호>> ");
			String pass=sc.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			
		}//while

	}

}
