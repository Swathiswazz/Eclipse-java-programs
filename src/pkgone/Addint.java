package pkgone;

import java.util.Scanner;

public class Addint {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		num1= sc.nextInt();
		System.out.println("Enter num2");
		num2= sc.nextInt();
		num3=num1+num2;
		System.out.println(num3);

	}

}
