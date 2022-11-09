package com.lavanya;

public class Stringdemo {
	public static void main(String arg[]) {
		String s1=" lavan ";
		System.out.println(s1);
		String s2=new String ("hai lavan");
		System.out.println(s2);
		String s3=new String(s1);
		System.out.println(s3);
		String s4=s2;
		System.out.println(s1);
		char[]ch= {'L','a','v','a','n','y','a'};
		System.out.println(ch);
		String s5=new String(ch,0,4);
		System.out.println(s5);
	}

}
