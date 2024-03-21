package Array;

import java.util.Scanner;

public class Foreachstring {

	public static void main(String[] args) {
		String [] ar =new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter characters:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("The characters are:" );
		
		for(String k:ar)
		{
		System.out.println(k);	
	    }

	}

}
