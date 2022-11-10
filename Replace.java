package com.spillted;

public class Replace {
	public static void main(String[] raj){
		StringBuffer sb=new StringBuffer("Lavanya");
		System.out.println(sb);
		System.out.println(sb.append("Java"));
		System.out.println(sb.replace(3, 4, "raje"));
		System.out.println(sb.delete(1,3));
		System.out.println(sb.reverse());
		
	}
}
