package Iterativestatements;

public class Whilereverse {

	public static void main(String[] args) {
		int rev=0;
		int num=1234321;
		int pal=num;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
	System.out.println("The reverese of given number is:" +rev);
	
	if(pal==rev)
	{
		System.out.println("Number is pallindrome");
			
	}
	else
	{
		System.out.println("Number is not a pallindrome");
	}
				
	}

}
