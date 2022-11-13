package coom.date11;

public class Puppy {
	int a=75;
	 void m() {
	 System.out.println("A class method"); }
	 }
	 class B extends Puppy{ // child
	 int b=100;
	 void m1() {
	 System.out.println("B class method"); }
	 }
	 class C{
	 public static void main(String[] args) {
	 B a=new B();// child class object
	  System.out.println(a.b);
	  a.m1();
	  System.out.println(a.a);
	  a.m();
	 }

}
