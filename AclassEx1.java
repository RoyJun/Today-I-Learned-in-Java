package javaclass;

public class AclassEx1 {

	public static void main(String[] args) {
		Aclass aa = new Aclass(); //인스턴스 객체 생성
		Aclass.Bclass bb = aa.new Bclass(); //Aclass내부에 있는 Bclass 객체 생성 
		bb.bField=10;
		bb.bMethod();
		aa.aMethod();

	}

}
