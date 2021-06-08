class B
{
    int pid=201;
    String p1;
	void get1(String pname)
	{
		this.p1=pname;
		System.out.println("BaseclassPid::"+pid);
	}
}
class D extends B
{
	void get2()
	{
		int pid=101;
		System.out.println("DerviedClassPid::"+super.pid);
		System.out.println("This is Baseclass value is::"+p1);
	}
}


public class Demo {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1("apple");
		f1.get2();

	}

}
