package Array;

import java.util.Scanner;

public class Sumofintegerarray {

	public static void main(String[] args) {
		int[] ar =new int[3];
		int[] br =new int[3];
		int[] cr =new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers in first array:");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter numbers in second array:");
		for(int i=0;i<3;i++)
		{
			br[i]=sc.nextInt();
		}
		System.out.println("The sum of two arrays:" );
		
	    for(int i=0;i<3;i++)
	    {
	    	cr[i]=ar[i]+br[i];
		System.out.println(cr[i]);
		
	    }
	}
}
		