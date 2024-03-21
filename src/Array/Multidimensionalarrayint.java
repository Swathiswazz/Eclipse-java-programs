package Array;

import java.util.Scanner;

public class Multidimensionalarrayint {

	public static void main(String[] args) {
		int[][] ar =new int[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				ar[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The numbers are:" );
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
