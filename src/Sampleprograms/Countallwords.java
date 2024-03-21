package Sampleprograms;

import java.util.Scanner;

public class Countallwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println("The count of all words in the given string is:"+count);
	}

}
