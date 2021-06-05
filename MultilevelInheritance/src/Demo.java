class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("BaseClass::"+pid);
	}
}
class D1 extends B
{
	int cid=2001;
	void get2()
	{
		System.out.println("DerviedClass::"+cid);
	}
}
class D2 extends D1
{
	void viewdata()
	{
		System.out.println("BothData::"+pid+""+cid);
	}
}



public class Demo {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.viewdata();

	}

}
