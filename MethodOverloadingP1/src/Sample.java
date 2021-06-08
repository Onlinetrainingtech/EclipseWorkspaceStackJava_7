class Demo
{
	void get1(int pid,String pname)
	{
		System.out.println("Your ProductDetails is::"+pid+""+pname);
	}
	void get1(int empid,int salary)
	{
		System.out.println("Your employeedetails is::"+empid+""+salary);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"apple");
		f1.get1(101,20000);
		

	}

}
