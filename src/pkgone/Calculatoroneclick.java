package pkgone;

import java.util.Scanner;

public class Calculatoroneclick {

	public static void main(String[] args) {
		int a,b,ch,c=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Select which operation do you select? \n"
				+ "1.Addition 2.subtraction 3.Multiplication 4.Division");
		System.out.println("Enter your choice from the above menu:");
		ch=sc.nextInt();
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		switch(ch)
		{
			case 1:c=a+b;
				System.out.println("Added result is:" +c);
				break;
			case 2:
				c=a-b;
				System.out.println("Subtracted result is:" +c);
				break;
			case 3:
				c=a*b;
				System.out.println("Multiplied result is:" +c);
				break;
			case 4:	
				c=a/b;
				System.out.println("Devided result is:" +c);
				break;
			default:System.out.println("Invalid operation");
			break;
		}
		} while((ch<=4)&&(ch!=0));
}
	
}
