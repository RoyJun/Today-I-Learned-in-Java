package javaAPI;

public class StringEx3 {

	public static void main(String[] args) {
		// ���ڿ� ã��
		String str="���Ϻ��� ��̳� �޹��Դϴ�.";
		int index=str.indexOf("���");
		System.out.println(index);
		String subject="�̰��� �ڹٴ�";
		int location= subject.indexOf("�ڹ�");
		
		if(location != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
			
		} else {
			System.out.println("�ڹٿ� ������ ���� å�̱���");
		}
		

	}

}
