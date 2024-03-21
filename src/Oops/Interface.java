package Oops;

interface Tvremote
{
	public void channelup();
	public void channeldown();
}
interface Smarttvremote extends Tvremote
{
public void bt();
}
class SmartTv implements Smarttvremote
{

	@Override
	public void channelup() {
		System.out.println("channelup details");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channeldown details");
		
	}

	@Override
	public void bt() {
		System.out.println("blue tooth details");
		
	}
		
}
public class Interface {

	public static void main(String[] args) {
		
	SmartTv s=new SmartTv();
	s.channelup();
	s.channeldown();
	s.bt();
		

	}

}
