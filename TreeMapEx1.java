package javaSpecial;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.put(35, "ȫ�浿");
		tree1.put(10, "��ö��");
		tree1.put(49, "�̿���");
		tree1.put(30, "�����");
		tree1.put(50, "������");
		Map.Entry<Integer, String> entry=null;
		entry=tree1.firstEntry();
		System.out.println("���� ���� ��ȣ : " + entry.getKey()+ ":" + entry.getValue());
		entry=tree1.lastEntry();
		System.out.println("���� ���� ��ȣ : " + entry.getKey()+ ":" + entry.getValue());
		
		
		
		
	}

}
