package Oops;
class Animal1
{
	public void animal1method()
	{
		System.out.println("animal1 details");
	}
	
}
class Lion extends Animal1
{
	public void lionmethod()
	{
		System.out.println("lion details");
	}
}
class Tiger extends Animal1
{
	public void tigermethod()
	{
		System.out.println("tiger details");
	}
}


public class Hierarchialinheritence {

	public static void main(String[] args) {
		Lion ob1=new Lion();
		ob1.lionmethod();
		ob1.animal1method();
		Tiger ob2=new Tiger();
		ob2.tigermethod();
		ob2.animal1method();
		
	}

}
