package javaclass;
//바깥 클래스
public class Aclass {
	public Aclass() {
		//필드
		int aField;
		
		
		System.out.println("Aclass가 생성됨");
}
	//내부에 있는 인스턴스 클래스
	
	class Bclass {
		//필드
		int bField;
		//static int bField2; #인스턴스 클래스 안에 정적 필드 못만든다 
		//생성자
		public Bclass() {
				System.out.println("Bclass가 생성됨");
		}
		//메소드
		void bMethod() { 
			
		}
	}
	//정적 클래스	
	static class cclass {
		int cField;
		static int cField2; //정적 필드	
		//생성자
		public cclass() {
			System.out.println("Cclass가 생성됨");
			
		}
		//메소드
		void cMethod() {
			
		}
		//정적메서드
		static void cMethod2 () {
			
		}
	}
	//메소드
	void aMethod() {
		//로컬 클래스 (메소드 안에도 별도의 클래스를 생성할 수 있다.)
		class Dclass {
			
			//필드
			int dField;
			//static int dField2;
			
			//생성자
			public Dclass() {
				System.out.println("Dclass가 생성됨");
			}
			
			//메소드
			void dMethod() {
			
			}
			//static void dMethod2() {}
				
		}
		Dclass dclass = new Dclass(); //인스턴스 객체 생성
		dclass.dField=10;
		dclass.dMethod();
		
	}//aMethod2()
}

