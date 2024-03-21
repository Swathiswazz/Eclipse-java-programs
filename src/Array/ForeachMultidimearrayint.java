package Array;

import java.util.Scanner;

public class ForeachMultidimearrayint {

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
		
		for(int v1[]:ar)
		{
			for(int v2:v1)
			System.out.print(v2 +"  ");
			System.out.println();
		}
			

	}

}
