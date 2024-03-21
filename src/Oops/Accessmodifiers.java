package Oops;

public class Accessmodifiers {
private int a;
int b;
protected int c;
	public static void main(String[] args) {
	
		Accessmodifiers ob=new Accessmodifiers();
		System.out.println(ob.a);//here we can access access private a
		System.out.println(ob.b);//here we can access default b
		System.out.println(ob.c);//here we can access protected c
	}

}
