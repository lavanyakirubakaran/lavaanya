package com.java1;

public class Staticblock {
	public Staticblock(){
	{
		System.out.println("lava");
	}
	System.out.println("haaa");
	}
	{	System.out.println("h1");
	
	}	static {//block
		System.out.println("lavanya1");
	}
	static {//block
		System.out.println("lavanya");
	}
	public static void main(String lava[]) {
		
		System.out.println("hai ");
		Staticblock sb=new Staticblock();
		Staticblock sb1=new Staticblock();
		Staticblock.test();
	}
	public static void test()
	{
			System.out.println("l222");
		
	}
}
