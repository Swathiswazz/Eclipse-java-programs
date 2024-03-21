package Oops;

class Parent
{
	public void parentmethod()
	{
		System.out.println("Parent class");
	}
	
}
class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("Child class");
	}
}
public class Singleinheritence {

	public static void main(String[] args) {
		Child ob=new Child();
		ob.parentmethod();
		ob.childmethod();
	/*Accessmodifiers ob=new Accessmodifiers();
	System.out.println(ob.b);//here we can access from access modifier class variable b ,default 
	System.out.println(ob.c);//here we can access from access modifier class variable c ,protected*/
	}

}
