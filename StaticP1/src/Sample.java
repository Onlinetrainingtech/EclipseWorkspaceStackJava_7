class Demo
{
	static int a=100;
	static void get1()
	{
		a++;
		System.out.println(a);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g1=new Demo();
		Demo g2=new Demo();
		g1.get1();
		g2.get1();

	}

}
