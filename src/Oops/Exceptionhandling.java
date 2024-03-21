package Oops;

public class Exceptionhandling {

	public static void main(String[] args) {
		// runtime
try {
	int a=40,b=0;
	double c=a/b;
	System.out.println(c);
}
catch(Exception e)
{
	System.out.println("arithemetic exception");
	System.out.println(e.getMessage());
}
	try {
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println("Nullpointer exception");
	
	}
	System.out.println("String length");

	{
		
	}
	}
}
