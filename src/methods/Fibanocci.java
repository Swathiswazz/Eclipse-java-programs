package methods;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the end limit:");
				int n1=sc.nextInt();
				int num1 =0,num2=1,num3;
				int s=num1;
				int k=num2;
				System.out.println(s);
				System.out.println(k);
				for(int i=2;i<n1;i++)
				{
					
				num3=num1+num2;
				System.out.println(num3);
				num1=num2;
				num2=num3;
				
			}
		
		}


	}
