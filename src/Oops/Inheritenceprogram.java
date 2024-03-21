package Oops;
class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;	
	
	public void printalldetails()
	{
		System.out.println("name=" +name);
		System.out.println("age=" +age);
		System.out.println("phoneno=" +phoneno);
		System.out.println("address=" +address);
		System.out.println("salary=" +salary);
		
	}
}
	
class Employee extends Member
{
	String department;
	String specialization;
	
}
class Manager extends Member
{
	String department;
	String specialization;
}
public class Inheritenceprogram {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="swathi";
		e1.age=30;
		e1.phoneno=3456789327l;
		e1.address="kavil";
		e1.salary=10000;
		System.out.println("Employee class");
		System.out.println("********************");
		e1.printalldetails();
		Manager m1=new Manager();
		System.out.println(e1.department="QA");
		System.out.println(e1.specialization="tester");
		System.out.println("Manager class");
		System.out.println("********************");
		m1.name="belgin";
		m1.age=31;
		m1.phoneno=9856789327l;
		m1.address="kannadiyil";
		m1.salary=50000;
		m1.printalldetails();
		System.out.println(m1.department="Development");
		System.out.println(m1.specialization="developer");
	}

}
