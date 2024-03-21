package Oops;

public class Constructorintro {
	//declaring instance variables
	String empname;
	int empid;
	
	//Creation of constructor
	public Constructorintro(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
    //Creation of method to display values
	public void display()
	{
		System.out.println("Empname:"+empname);
		System.out.println("Empid:"+empid);
		
	}
	public static void main(String[] args) {
		//class object creation and initializing instance variable by constructor invoke
		Constructorintro con1=new Constructorintro("Swathi",101);
		Constructorintro con2=new Constructorintro("Belgin",102);
		con1.display();
		con2.display();

	}

}
