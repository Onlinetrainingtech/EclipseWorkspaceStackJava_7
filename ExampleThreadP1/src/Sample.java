class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is run method.."+Thread.currentThread().getName());
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Demo t1=new Demo();
		Thread s1=new Thread(t1);
		s1.start();
		s1.setName("FirstThread");
		Demo t2=new Demo();
		Thread s2=new Thread(t2);
		s2.start();

	}

}
