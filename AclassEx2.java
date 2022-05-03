package javaclass;
/* 
내부클래스를 사용하려면 외부클래스의 인스턴스 객체를 먼저 생성하여 사용한다.
정적 내부 클래스를 사용하려면 외부 클래스 객체를 생성할 필요가 없고 외부클래스를 통해 생성하면 된다.

*/
public class AclassEx2 {

	public static void main(String[] args) {
		Aclass.cclass cc= new Aclass.cclass(); //내부 정적 클래스 객체 생성 
		cc.cField=50;
		cc.cMethod();
		
	}

}
