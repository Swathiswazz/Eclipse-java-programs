
package Oops;
interface Basicanimal
{
	public void eat();
	public void sleep();
}
class Monkey
{
	void jump()
	{
		System.out.println("jump hours");	
	}
	void bite()
	{
		System.out.println("bite hours");
	}
}
class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
    System.out.println("speak hours");
	}

	@Override
	public void eat() {
		System.out.println("eat hours");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep hours");
		
	}
}
public class Interfacemonkey {

	public static void main(String[] args) {
		Human h=new Human();
		h.bite();
		h.eat();
		h.sleep();
		h.jump();
		h.speak();
	}

}
