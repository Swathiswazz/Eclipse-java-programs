package Array;

import java.util.Scanner;

public class Uspass {

	public static void main(String[] args) {
		String [][] ar =new String[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username and password:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.next();
			}
		}
		
		System.out.println("Entered username & password is:" );
		
		for(String k[]:ar)
		{
			for(String v1:k)
			{
				System.out.println(v1);	
			}
			System.out.println();
	    }

	}

}
