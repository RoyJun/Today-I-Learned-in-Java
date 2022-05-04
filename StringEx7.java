package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {
		String text="È«±æµ¿,±èÃ¶¼ö&¹ÚÂùÈ£,ÀÌ¿µÈñ#¹ÚÁö¼º";
		String[] names=text.split(",|&|#");
		/*
		 for(String na:names) {
		 system.out.println(na);
		 */
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
