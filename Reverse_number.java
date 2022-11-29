package com.javaproject;
import java.util.Scanner;
public class Reverse_number {
         public static void main(String lava[]) {
        	 Scanner in=new Scanner(System.in);
        	 System.out.println("enter the number : ");
        	 int L=in.nextInt();
        	 int reverse =0,rem;
        	 while(L!=0)
        	 {
        		 rem=L%10;
        		 reverse=(reverse*10)+rem;
        		 L=L/10;
        	 }
        	 System.out.println("Reverse number : "+reverse);
        	 
         }
}
