package Oops;
abstract class Car
{
	abstract public void speedlimit();
	public void cardetails()
	{
		System.out.println("Car details");
	}
}

class Volvo extends Car
{

	@Override
	public void speedlimit() {
	System.out.println("Volvo speed limit");
	}
}
class Kia extends Car
{

	@Override
	public void speedlimit() {
	System.out.println("kia speed limit");
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		
Volvo ob=new Volvo();
Kia ob1=new Kia();
ob.speedlimit();
ob1.speedlimit();
ob.cardetails();
ob1.cardetails();
	}

}
