package com.spillted;

public class Buffer {
	public static void main(String[] args) {
		String s="Lavanya";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.insert(3, "R"));//added
		System.out.println(sb.capacity());
		System.out.println(sb.toString());//display repeated
	}
	 class Buffer1  {
		public static String m1(String s) {
			StringBuffer sb=new StringBuffer(s);
			System.out.println(sb.insert(5, "X"));
			System.out.print(sb.toString());
			return sb.toString(); }
		public static void main(String[] args) {
			m1("Lavanya");		
		}}}


