package pkgone;

public class Operators {

	public static void main(String[] args) {
		
		System.out.println("Arithemic operators");

		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		
		System.out.println("Assignment operators");
		
		int c;
		System.out.println(c=a);
		System.out.println(a+=b);//a=a+b 30
		System.out.println(a-=b);//a=a-b 20
		System.out.println(a*=b);//a=a*b 200
		System.out.println(a/=b);//a=a/b 20
		
		System.out.println("Relational operators");
		int v1=40,v2=20;
		System.out.println(v1>v2);
		System.out.println(v1<v2);
		System.out.println(v1==v2);
		System.out.println(v1!=v2);
		
		
		System.out.println("Logical operators");
		
		/*
		 A B  A&&B  A||B  !A  !B
		 0 0    0    0     1   1
		 1 0    0    1     0   1
		 0 1    0    1     1   0
		 1 1    1    1     0   0
		  
		 
		 */
		
		String username="abc";
		String password="abc123";
		System.out.println(username=="abc" && password=="abc123");
		System.out.println(username=="abc" || password=="abc123");
		System.out.println(!(username=="abc"));
		
		System.out.println("Unary operators");
		int v3=10;
		System.out.println(v3++); //10
		System.out.println(v3); //11
		System.out.println(++v3);// 11+1=12
		System.out.println(v3); //12
		
		System.out.println("ternary operators");
		//variable=condition?exp1:exp2;
		//v1 =40,v2=20 (already declared above)
		String s=v1>v2?"v1 is geater":"v2 is greater";
		System.out.println(s);
		
		
	} 

}
