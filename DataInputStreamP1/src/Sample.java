import java.io.DataInputStream;
import java.io.IOException;

class Demo
{
	
	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws IOException
	{
		System.out.println("Enter the value is::");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
}
public class Sample 
{

	public static void main(String[] args) throws IOException
	{
		
		Demo f1=new Demo();
		f1.get1();
		f1.display();

	}

}
