package exam04_genetic_method;

public class BoxingMethodExample1 {

	public static void main(String[] args) {
		Box<Integer> box1 =Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Util.boxing("ȫ�浿");
		
		
	}

}
