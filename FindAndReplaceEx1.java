package APIConfirm;

public class FindAndReplaceEx1 {

	public static void main(String[] args) {
		String str="��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
				
		if(index==-1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "JAVA");
			System.out.println("-->" + str);
		}
		String str1 = "�� ���̴� 25���̰� Ű�� 175cm�̰� �����Դ� 70kg�Դϴ�.";
		str1=str1.replaceAll("[0-9]","*");
		System.out.println(str1);
		String str2="�̹� �� û�Ҵ���� ��ö��.ȫ�浿.�̿����Դϴ�";
		str1=str1.replaceAll(".", ",");
		System.out.println(str2);
		
	}

}
