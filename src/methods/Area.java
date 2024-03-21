package methods;

public class Area
{

	public static void main(String[] args) 
	{
			Area a1=new Area();
			a1.square(2);
			float t=a1.triangle(2,4);
			System.out.println("Area of triangle is:" +t);
			a1.circle(2);
			a1.rectangle(2,3);
			
	}
			public void square(int a)
			{
				int c;
				c=a*a;
				System.out.println("Area of Square is:" +c);
			}
			public float triangle(float a,float b)
			{
				float l=0.5f;
				float c=l*a*b;
				return c;
			}
					public void circle(double r)
					{
						double c=3.14*r*r;
						System.out.println("Area of circle is:" +c);
					}
					public void rectangle(int a,int b)
					{
						int c;
						c=a*b;
						System.out.println("Area of rectangle is:" +c);
					}

}
