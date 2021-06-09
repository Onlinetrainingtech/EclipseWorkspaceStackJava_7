class Demo
{
	void get1()
	{
		try
		{
		int a=100/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the divisor"+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function");
	}
	void get3()
	{
		try
		{
		String s1=null;
		System.out.println("Length of the String:"+s1.length());
		}
		catch(NullPointerException t1)
		{
			System.out.println("Please check the String");
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get3();
	}

}
