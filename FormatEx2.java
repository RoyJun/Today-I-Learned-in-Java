package javaAPI;

import java.text.MessageFormat;

public class FormatEx2 {

	public static void main(String[] args) {
		//���ڿ� ���� Ŭ����
		String[] member= {"hong", "ȫ�浿", "010-7777-7777", "hong@naver.com"};
		String text="ȸ�� ID : {0}\nȸ���̸� : {1}\n��ȭ��ȣ : {2}\n�̸��� : {3}";
		String result = MessageFormat.format(text, member);
		System.out.println(result);
		String name="��ö��";
		String text2="{0}ȸ���� ������ {0}ȸ���Բ��� �湮�ϼż� ���� ����̽��ϴ�. �� {0}ȸ���Բ� ����帳�ϴ�." ;
		System.out.println(MessageFormat.format(text2, name));
		System.out.println("ȸ��ID : " + member[0]);
		System.out.println("ȸ�� �̸� : " + member[1]);
		System.out.println("��ȭ��ȣ : " + member[2]);
		System.out.println("�̸��� : " + member[3]);
	}

}
