abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is ready to dispatch");
	}
 abstract void running();
 public void working()
 {
	 System.out.println("Bike is working fine");
 }
	
}
class Hero extends Bike{

	@Override
	void running() {
		System.out.println("Hero bike is running successfully");
		
	}

}
public class AbstractclassExample {
public static void main(String args[]){
	Bike b=new Hero();
	b.working();
	b.running();
}
}
