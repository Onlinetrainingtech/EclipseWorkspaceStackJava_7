import java.util.Scanner;

class Demo
{
	int empid;//declaration of variable
	String empname;
	Scanner sc=new Scanner(System.in);
	void addEmployee()
	{
		System.out.println("Enter the value is::");
		empid=sc.nextInt();
		empname=sc.next();
	}
	void viewEmployee()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addEmployee();
		f1.viewEmployee();

	}

}
