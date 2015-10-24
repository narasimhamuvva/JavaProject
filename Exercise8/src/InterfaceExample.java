interface Alphabit
{
	void one();
	void two();
	void three();
	void four();
	
}
interface Numbers
{
	void numberone();
	void numbertwo();

}

abstract class One implements Alphabit,Numbers
{
	public void one()
	{
		System.out.println("This is implementation of first method");
	}
	public void numberone()
	{
		System.out.println("This is implementation of numberone method");
	}
	public void numbertwo()
	{
		System.out.println("This is implementation of numbertwo method");
	}
}
class Two extends One
{
	
	public void two() { 
		System.out.println("This is implementation of second method");
		
	}

	public void three() {
		System.out.println("This is implementation of third method");
		
	}
	public void four() {
		System.out.println("This is implementation of fourth method");
	}
	
}
public class InterfaceExample {
	public static void main(String args[])
	{
	Alphabit a=new Two();
	Two n=new Two();
	a.one();
	a.two();
	a.three();
	a.four();
	n.numberone();
	n.numbertwo();
}
}


