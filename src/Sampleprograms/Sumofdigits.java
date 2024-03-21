package Sampleprograms;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Sumofdigits s= new Sumofdigits();
		s.sumofdigits(k);
		

	}

	public void sumofdigits(int k)
	{
		int sum=0,dig;
		while(k!=0)
		{
			dig=k%10;
			sum=sum+dig;
			k=k/10;
		}
		System.out.println("The sum of digit is:"+sum);
	}
}
