package com.spillted;

public class Inheritance { 
	int a=100;
	void m() {
	System.out.println("Inheritance class method"); }
	}
	class B extends Inheritance{ 
	int b=200;
	void m1() {
	System.out.println("B class method"); }
	}
	class C{
	public static void main(String[] args) {
    B a=new B();
	System.out.println(a.b);
	a.m1();
	System.out.println(a.a);
	a.m();
	}

}
