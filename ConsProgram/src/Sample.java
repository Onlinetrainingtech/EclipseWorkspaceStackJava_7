class Demo
{
	Demo()
	{
	  System.out.println("This is Default Cons..");	
	}
	Demo(int pid)
	{
		System.out.println("This is Param Cons..");
	}
	void get1()
	{
		System.out.println("This is normal method");
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		new Demo(1001);
        f1.get1();
	}

}
