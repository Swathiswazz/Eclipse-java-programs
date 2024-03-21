package Sampleprograms;

import java.util.Scanner;

public class Largestamongarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array limit:");
		int n=sc.nextInt();
		int[] ar =new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int max=ar[0];
		for(int i=0;i<n;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("The largest among the array is:"+max);

	}

}
