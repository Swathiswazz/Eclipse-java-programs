package Oops;

import java.util.Scanner;

class Occurenceinstring
{
  
	public static void main(String[] args)  
	{  
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	System.out.print("Enter a string: ");  
	String str= sc.nextLine(); 
	System.out.println("You have entered: "+str);//reads string             
    char ch[]= str.toCharArray();
    int count=0;
    
    for (int i = 0; i < ch.length;i++) 
    {
    	count=1;
        for (int j =i+1; j<ch.length; j++)   
        {   
        if (ch[i]== ch[j])
        {
        count++; 
        ch[j]='0';
        }
        }
        if (count>1 && ch[i]!='0')
        {
        //prints occurrence of the character
           
        System.out.println("The occurence of " +ch[i] + " count is = " +count); 
       // System.out.println("Count is =" +count);
        }
    }
    
	}
}
