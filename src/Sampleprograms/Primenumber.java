package Sampleprograms;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int	num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		/*int flag = 0;
		for(int i=2;i<=num/2;i++) 
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(num +"  is not a prime number");
		}
		else
		{
		System.out.println(num +" is a prime number");	
		}
	}		
}
*/	int f=0;
	if(num%2==0)
{
	f=1;
}
if(f==1)
{
System.out.println(num +"  is not a prime number");
}
else
{
	System.out.println(num +" is a prime number");		
}
}
}
		