package javaclass;
//�ٱ� Ŭ����
public class Aclass {
	public Aclass() {
		//�ʵ�
		int aField;
		
		
		System.out.println("Aclass�� ������");
}
	//���ο� �ִ� �ν��Ͻ� Ŭ����
	
	class Bclass {
		//�ʵ�
		int bField;
		//static int bField2; #�ν��Ͻ� Ŭ���� �ȿ� ���� �ʵ� ������� 
		//������
		public Bclass() {
				System.out.println("Bclass�� ������");
		}
		//�޼ҵ�
		void bMethod() { 
			
		}
	}
	//���� Ŭ����	
	static class cclass {
		int cField;
		static int cField2; //���� �ʵ�	
		//������
		public cclass() {
			System.out.println("Cclass�� ������");
			
		}
		//�޼ҵ�
		void cMethod() {
			
		}
		//�����޼���
		static void cMethod2 () {
			
		}
	}
	//�޼ҵ�
	void aMethod() {
		//���� Ŭ���� (�޼ҵ� �ȿ��� ������ Ŭ������ ������ �� �ִ�.)
		class Dclass {
			
			//�ʵ�
			int dField;
			//static int dField2;
			
			//������
			public Dclass() {
				System.out.println("Dclass�� ������");
			}
			
			//�޼ҵ�
			void dMethod() {
			
			}
			//static void dMethod2() {}
				
		}
		Dclass dclass = new Dclass(); //�ν��Ͻ� ��ü ����
		dclass.dField=10;
		dclass.dMethod();
		
	}//aMethod2()
}

