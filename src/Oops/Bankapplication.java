package Oops;

import java.util.Scanner;

interface Bank
{
	void deposit(double amount);
	public void withdraw(double amount);
	public void getbalance();
}
class Federal implements Bank
{
double balance=5000;
	@Override
	public void deposit(double amount)
	{
		
		balance=balance+amount;
		System.out.println("The deposited amount is "+amount);


	}

	@Override
	public void withdraw(double amount1) {
		balance=balance-amount1;
		System.out.println("The withdrawal amount is "+amount1);
		
	}

	@Override
	public void getbalance() {
		System.out.println("The remaining balance is = " +balance);
		
	}
	
}

public class Bankapplication {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		int a=sc.nextInt();
		Federal f=new Federal();
		f.deposit(a);
		f.getbalance();
		System.out.println("Enter the amount to withdraw");
		int b=sc.nextInt();
		f.withdraw(b);
		f.getbalance();

	}

}
