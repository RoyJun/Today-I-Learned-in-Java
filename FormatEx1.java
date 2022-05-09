package javaAPI;

import java.text.DecimalFormat;

public class FormatEx1 {

	public static void main(String[] args) {
		DecimalFormat df;
		double num1=23.526124;
		df=new DecimalFormat("0.0");
		System.out.println(df.format(num1));
		int num2=7850000;
		df = new DecimalFormat("#,###¿ø");
		System.out.println(df.format(num2));
		double num3=0.25264;
		df=new DecimalFormat("#.##");
		System.out.println(df.format(num3));
		
	}

}
