package methods;

public class Methodtypes
{

	public static void main(String[] args) 
	{
		Methodtypes m=new Methodtypes();
		m.add();
		int s=m.sub();
		System.out.println(s);
		int mu=m.mul(20,10);
		System.out.println(mu);
		m.div(20,2);
		
	}
		//1. Method without return type and without parameter
		public void add()
		{
			int a=20,b=10,c;
			c=a+b;
			System.out.println(c);
		}
		//2. Method with return type and without parameter
		public int sub()
		{
			int a=20,b=10,c;
			c=a-b;
			return c;
		}
		//3. Method with return type and with parameter
				public int mul(int a,int b)
				{
					int c;
					c=a*b;
					return c;
				}
		//4. Method without return type and with parameter
				public void div(int a,int b)
				{
					int c;
					c=a/b;
					System.out.println(c);
				}
	}
