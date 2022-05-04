package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {
		String ssn="921023-1369744";
		String A = ssn.substring(7);
		String B = ssn.replace(A, "*******");
		System.out.println(B);
		
		String original = "Java Programming";
		String lower=original.toLowerCase();
		String upper=original.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
	}

}
