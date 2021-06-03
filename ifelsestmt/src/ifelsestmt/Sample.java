package ifelsestmt;

import java.util.Scanner;

class Demo
{
	//int productid=2001;
	int f1;
	Scanner sc=new Scanner(System.in);
	
	/*void get1()
	{
		if(productid==1001)
		{
			System.out.println("ProductId is equal");
		}
		else
		{
			System.out.println("ProductId is not equal");
		}
	}*/
	void get2()
	{
		System.out.println("Enter the value is::");
		f1=sc.nextInt();
		if(f1%2==0)
		{
			System.out.println("Even"+f1);
		}
		else
		{
			System.out.println("Odd"+f1);
		}
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.get1();

	}

}
