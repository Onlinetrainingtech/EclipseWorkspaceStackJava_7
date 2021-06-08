abstract class Sample
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal method");
	}
}
class Foo extends Sample
{
	public void get1()
	{
		System.out.println("This is Abstract Method..");
	}
}


public class Demo {

	public static void main(String[] args) {
	
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
