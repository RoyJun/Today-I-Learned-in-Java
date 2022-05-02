package practice;

public class ComputerEx1 {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		
		int[] values1={1,2,3,4,5};
		int result1 = com1.sum1(values1);
		System.out.println(result1);
		
		int result2 = com1.sum1(new int[] {1,2,3,4,5});
		System.out.println(result2);
		
		int result3 = com1.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		int result4 = com1.sum2(1,2,3,4,5,5);
		System.out.println(result4);
		

	}

}
