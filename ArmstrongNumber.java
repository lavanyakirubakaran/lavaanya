package com.javaproject;
import java.util.Scanner;
public class ArmstrongNumber {
	
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int d1,d2,d3;{
        System.out.println("enter 3 numbers: ");
      
        d3=temp%10;
        temp=temp/10;
     
        d2=temp%10;
        temp=temp/10;
      
        d1=temp%10;
        int result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        
        if(n==result) {
        	System.out.println(n+ "is aemstrong number");
        }else {
        	System.out.println(n+ "is not armstrong number");
        }}}
