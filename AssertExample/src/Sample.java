import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int age;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age::");
	    age=sc.nextInt();
	    assert(age>0)&&(age<130);
	    System.out.println("the entered age is:"+age);

	}

}
