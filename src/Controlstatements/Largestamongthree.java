package Controlstatements;

public class Largestamongthree {

	public static void main(String[] args) {
		int a=50,b=400,c=10;
		if((a>b)&&(a>c))
		{
			System.out.println("a is larger");
		}
		else if((b>c)&&(b>a))
		{
			System.out.println("b is larger");
		}
		else
		{
			System.out.println("c is larger");
		}
	}

}
