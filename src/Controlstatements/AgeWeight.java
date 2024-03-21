package Controlstatements;

public class AgeWeight {

	public static void main(String[] args) {
		int age=18,weight=50;
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("Eligible to donate blood");
			}
			else
			{
				System.out.println("Not eligible to donate blood,weight must be >= to 50");
			}
		}
		else
		{
			System.out.println("Not eligible to donate blood,age must be >=18");
		}

	}

}
