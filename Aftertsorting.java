package com.spillted;
import java.util.Arrays;
public class Aftertsorting {
	public static void main(String[] raj){
		String[] sa= {"Madha","Banu","Gv","Ramya","Priya"};
		for(String i:sa) 
		System.out.print(i+" ");
		System.out.println();
		System.out.println("After Sorting");
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
		}

}
