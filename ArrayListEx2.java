package javaSpecial;


import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.<String>asList("ȫ�浿","��ö��","�̿���");
		for(String name:list1) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(10,20,30,40,50);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
