package Array;

import java.util.Scanner;

public class Countarray {

	public static void main(String[] args) {
		int[] ar =new int[7];
		int poscount=0;
		int negcount=0;
		int zerocount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<7;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<7;i++)
		{
			if(ar[i]>0)
			{
				poscount++;
			}
			else if(ar[i]<0)
			{
				negcount++;
			}
			else
			{
				zerocount++;
			}
		}	
		System.out.println("The positive number count in the given array is:" +poscount );
		System.out.println("The negative number count in the given array is:" +negcount );
		System.out.println("The zero count in the given array is:" +zerocount );
	}

}
