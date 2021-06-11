class Demo extends Thread
{
	public synchronized void get1()
	{
		try
		{
		   System.out.println("WaitIn");
		   wait(10000);
		   System.out.println("WaitOut");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	public synchronized void get2()
	{
		System.out.println("NotifyIn");
		notify();
		System.out.println("NotifyOut");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();
		t1.get2();

	}

}
