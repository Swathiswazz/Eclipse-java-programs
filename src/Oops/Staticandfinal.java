package Oops;

public class Staticandfinal {
	public static String name="Swathi";
	static final double pi=3.14;
	final double pie=3.14;

	public static void main(String[] args) {
		System.out.println(name);
		System.out.println(pi);
		Staticandfinal s=new Staticandfinal();
		System.out.println(s.pie);

	}

}
