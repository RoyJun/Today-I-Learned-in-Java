package javaAPI;

public class StringBufferEx1 {

	public static void main(String[] args) {
		/*String str="korea";
		str+="fighting";
		str+="corona";
		System.out.println(str);*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("korea");
		sb.append("fighting");
		sb.append("corona");
		System.out.println(sb.toString());
		sb.insert(5, "-");
		System.out.println(sb.toString());
		sb.insert(14, "==>"); //추가
		System.out.println(sb.toString());
		sb.setCharAt(5, ':'); //변경
		System.out.println(sb.toString());
		sb.replace(6, 14, "remember");
		System.out.println(sb.toString());
		sb.delete(14,23);
		System.out.println(sb.toString());
		String result=sb.toString();
		System.out.println(result);
	}

}
