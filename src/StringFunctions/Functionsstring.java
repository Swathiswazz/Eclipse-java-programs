package StringFunctions;
public class Functionsstring {

	public static void main(String[] args) {
		String s1="hello";
		String s2="welcome";
		String s3="  Hello swathi   ";
		String s4="where are you";
		String s5="HOW";
		
		//concat
		System.out.println(s1.concat(s2));
	   //equals
		System.out.println(s2.equals(s3));
		//startsWith
		System.out.println(s1.startsWith("hello"));
		//endsWith
		System.out.println(s3.endsWith("swathi"));
		//trim
		System.out.println(s3);
		System.out.println(s3.trim());
		System.out.println(s3.contains("swathi"));
		//length
		System.out.println(s1.length());
		//charAt
		System.out.println(s1.charAt(0));
		//substring
		System.out.println(s4.substring(1,3));
		//split  Doubt
		String[] st=s4.split("");
		for(String str:st)
		{
			System.out.println(str);
		}
		//replace
		System.out.println(s4.replace("where","how"));
		//toLowerCase
		System.out.println(s5.toLowerCase());
		//toUpperCase
		System.out.println(s4.toUpperCase());
		
		
}
}