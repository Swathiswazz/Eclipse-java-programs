package Controlstatements;

import java.util.Scanner;

class Average
{

public float avg(float x,float y,float z) 
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter numbers=");
	x=sc.nextInt();
	y=sc.nextInt();
	z=sc.nextInt();
    return(x+y+z)/3;
}
}
public class Avgofthreenumbers {

	public static void main(String[] args) {
		float avg = 0f;
		Average a1=new Average ();
		avg=a1.avg(0f,0f,0f);
		System.out.println("The average is="+avg);
	}

}
