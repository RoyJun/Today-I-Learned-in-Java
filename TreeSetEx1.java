package javaSpecial;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		//�˻������ ��ȭ�� �÷��� �����ӿ�ũ
		TreeSet<Integer> scores=new TreeSet<Integer>();
		scores.add(80);
		scores.add(88);
		scores.add(90);
		scores.add(70);
		scores.add(75);
		scores.add(65);
		scores.add(76);
		scores.add(85);
		System.out.println("���� ���� ���� : " + scores.first());
		System.out.println("���� ���� ���� : " + scores.last());
		
	}

}
