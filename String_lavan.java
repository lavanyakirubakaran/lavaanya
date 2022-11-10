package com.methodsusage;

public class String_lavan {
	public static void main(String lava[]) {
		String s1="Lavanya distric collector of chengalpattu";
		String s2="lavanya";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("D"));
		System.out.println(s1.indexOf("d"));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(5,9));
		System.out.println(s1+".IAS");
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("collector"));//true
		System.out.println(s1.startsWith("L"));//true
		System.out.println(s1.endsWith("U"));//false
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());

		System.out.print(s1.repeat(3)+" ");
		System.out.println(s2.replace('a','R'));
		
	}

}
