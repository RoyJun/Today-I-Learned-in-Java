package APIConfirm;

import java.util.StringTokenizer;

public class SplitEx1 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		//split()메소드
		String[] names = str.split(",");
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		//StrignTokenizer메소드
		StringTokenizer	st=new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}

}
