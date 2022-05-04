package javaAPI;

import java.util.Arrays;

public class Member2 implements Cloneable {
	//필드
	public String name;
	public int age;
	public int[] scores; 
	public Car car;
	
	//생성자
	public Member2(String name, int age, int[] scores, Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member2 cloned = (Member2) super.clone(); //name. age 얕은 복제
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
		cloned.car=new Car(this.car.model);
		return cloned;
	}
	//메소드
	public Member2 getMember() {
		Member2 cloned=null;
		try {
			cloned=(Member2) clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
