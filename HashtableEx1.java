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
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�>> ");
			String id=sc.next();
			System.out.print("��й�ȣ>> ");
			String pass=sc.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
			
		}//while

	}

}
