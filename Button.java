package javaclass;

public class Button {
	//인터페이스 타입 필드
	OnClickListener listener; 
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;
	}
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		//추상메소드
		void onClick();
		
	}
}
