package javaclass;

public class AclassEx1 {

	public static void main(String[] args) {
		Aclass aa = new Aclass(); //�ν��Ͻ� ��ü ����
		Aclass.Bclass bb = aa.new Bclass(); //Aclass���ο� �ִ� Bclass ��ü ���� 
		bb.bField=10;
		bb.bMethod();
		aa.aMethod();

	}

}
