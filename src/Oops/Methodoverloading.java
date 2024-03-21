package Oops;

public class Methodoverloading {
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Integer value of c is=" +c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("Double Value of c=" +c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("C double value is=" +c);
	}
	public void add(String a,String b)
	{
		String c=a+b;
		System.out.println("c String value is=" +c);
	}

	public static void main(String[] args) {
		Methodoverloading m=new Methodoverloading();
		m.add(4.5, 3);
		m.add(2, 4.4);
		m.add(4, 5);
		m.add("swa", "thi");
		
	}

}
