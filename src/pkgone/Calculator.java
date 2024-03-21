package pkgone;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b,ch,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("Enter your choice:  1. Add  2. Sub  3.Mul 4.Div " );
		ch=sc.nextInt();
	
		switch(ch)
		{
			case 1: c=a+b;
			break;
			case 2: c=a-b;
			break;
			case 3: c=a*b;
			break;
			case 4: c=a/b;
			break;
			default:System.out.println("Invalid choice");
			break;
		}
		System.out.println("The result is:  " + c);

	}

}
