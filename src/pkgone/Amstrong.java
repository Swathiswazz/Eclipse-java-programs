package pkgone;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) 
	{
		int num1,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		num1= sc.nextInt();
		int amstr=num1;
		while(amstr!=0)
		{
		rem=amstr%10;
		sum=sum+(int)Math.pow(rem, 3);
		amstr=amstr/10;
		}
	
		if(num1==sum)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not an amstrong number");	
		}
	
	}
}
