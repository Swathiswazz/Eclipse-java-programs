package methods;

import java.util.Scanner;
public class Vowelcount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		Vowelcount v=new Vowelcount();
		v.vowel(s);
		
	}
		
public void vowel(String s)
{
	int vow=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			vow++;
		}
	}	
	System.out.println("The vowel count in the given string is:"+vow);
}
	
}
