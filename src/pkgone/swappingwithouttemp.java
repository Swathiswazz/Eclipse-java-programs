package pkgone;

public class swappingwithouttemp {

	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("before swapping");
		System.out.println("Value of a and b is" +" " +a +"  " +b);
		a=a+b;//15
		b=a-b;//15-5=10
		a=a-b;//15-10=5
		System.out.println("after swapping");
		System.out.println("Value of a and b is" +" " +a +"  " +b);
			


	}

}
