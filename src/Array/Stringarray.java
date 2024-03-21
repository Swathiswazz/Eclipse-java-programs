package Array;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String [] ar =new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter characters:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("The characters are:" );
		
		for(int i=0;i<ar.length;i++)
	    {
		System.out.println(ar[i]);
		
	    }


	}

}
