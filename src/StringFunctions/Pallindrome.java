package StringFunctions;

public class Pallindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
       for(int i=s.length()-1;i>=0;i--)
       {
    	  rev=rev+s.charAt(i);
    	  
       }
       System.out.println("The reverse is: " + rev);
       if(rev.equals(s))
       {
    	   System.out.println("String is Palindrome");
       }
    	else
    	{
    		System.out.println("String is not a palindrome");
    	}
 
	}

}
