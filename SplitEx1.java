package APIConfirm;

import java.util.StringTokenizer;

public class SplitEx1 {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		//split()�޼ҵ�
		String[] names = str.split(",");
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
		
		//StrignTokenizer�޼ҵ�
		StringTokenizer	st=new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}

}
