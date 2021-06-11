class Demo extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=2;i++)
			{
				System.out.println("SleepIn"+i);
				
				Thread.sleep(10000);
				
				System.out.println("SleepOut"+i);
			}
			System.out.println("ThreadPriority::"+currentThread().getPriority());
		}
		catch(InterruptedException r)
		{
			System.out.println(r);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		try
		{
			t1.join(10000);
		}
		catch(InterruptedException t)
		{
			
		}
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		System.out.println("Thread is Alive or not::"+t1.isAlive());
		System.out.println("Thread is Interruted::"+t1.isInterrupted());

	}

}
