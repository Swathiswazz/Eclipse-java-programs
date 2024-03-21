package Oops;

		class Animal
		{
			public void animalmethod()
			{
				System.out.println("animal details");
			}
			
		}
		class Dog extends Animal
		{
			public void dogmethod()
			{
				System.out.println("dog details");
			}
		}
		class Babydog extends Dog
		{
			public void babydogmethod()
			{
				System.out.println("babydog details");
			}
		}

		public class Multilevelinheritence {

			public static void main(String[] args) {
				Babydog ob=new Babydog();
				ob.animalmethod();
				ob.dogmethod();
				ob.babydogmethod();

			}

		}
