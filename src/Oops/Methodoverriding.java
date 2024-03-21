package Oops;
class Parent1
{
	public void job()
	{
		System.out.println("Engineer");
		
	}
}
class Son extends Parent1
{
	public void job()
	{
		System.out.println("Doctor");
		super.job();
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.job();

	}

}
