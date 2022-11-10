package com.stringpooling;

public class Date7String {
	public static void main (String lava[]) {
		String s1="a";
		String s2="b";
		System.out.println(s1==s2);//false
		String s3="b";
		System.out.println(s2==s3);//true
		String s4=new String("a");
		String s5=new String("b");
		String s6=new String("b");
		System.out.println(s4==s5);
		System.out.println(s6==s5);
		System.out.println(s6.equals(s5));
		
	}

}
