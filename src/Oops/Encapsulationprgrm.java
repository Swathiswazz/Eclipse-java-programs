package Oops;
class Empdetails
{
	private String empname;
	private int empid;
	public String getEmpname()
	{
	return empname;	
	}
	public void setEmpname(String empname)
	{
		this.empname=empname;
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
}
public class Encapsulationprgrm {

	public static void main(String[] args) {
		Empdetails ob=new Empdetails();
		ob.setEmpid(1);
		ob.setEmpname("swathi");
		System.out.println("name="+ob.getEmpname());
		System.out.println("id="+ob.getEmpid());	

	}

}
