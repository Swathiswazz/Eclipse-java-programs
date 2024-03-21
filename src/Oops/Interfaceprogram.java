package Oops;
interface Bike
{
	public void acceleration();
}
interface Bikeaccessories
{
	public void bikedetails();
}
interface Bikeworkshop
{
	public void bikeworkshop();
}
class Honda implements Bike,Bikeaccessories,Bikeworkshop
{

	@Override
	public void bikedetails() {
		System.out.println(" bike details");
		
	}

	@Override
	public void acceleration() {
		System.out.println(" acceleration details");
		
	}

	@Override
	public void bikeworkshop() {
		System.out.println(" workshop details");
		
	}
	
}
public class Interfaceprogram {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.acceleration();
		h.bikedetails();
		h.bikeworkshop();
	}

}
