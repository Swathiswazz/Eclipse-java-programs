package Sampleprograms;

public class Searchstring {

	public static void main(String[] args) {
		String str1="java language is platform independant";
		String str2="language";
		Searchstring se=new Searchstring();
		se.substring(str1,str2);
		
	}
		
public void substring(String str1,String str2)
	{
    if(str1.contains(str2))
    {
	System.out.println("The string is present");
	}
    else
	{
	System.out.println("The string is not present");
	}
	
}
}
