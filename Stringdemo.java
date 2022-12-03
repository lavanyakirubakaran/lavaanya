package com.java1;

public class Stringdemo {
public static void main(String []lava) {
	String s1=new String("Lavanya");
	String s2="lavanya";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.length());
	System.out.println(s1.isBlank());
	System.out.println(s1.isEmpty());
	System.out.println(s1.equals(s2));
	System.out.println(s2.length());
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s2));
	System.out.println(s1.startsWith("L"));
	System.out.println(s2.endsWith("a"));
}
}
