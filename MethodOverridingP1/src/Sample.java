class Product
{
	void display()
	{
		System.out.println("This is ProductClass");
	}
}
class Category extends Product
{
	void display()
	{
		System.out.println("This is CategoryClass");
	}
}
class Employee extends Product
{
	void display()
	{
		System.out.println("This is EmployeeClass");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Product p1=new Product();
		Category c1=new Category();
		Employee e1=new Employee();
		
		Product ref;
		ref=p1;
		p1.display();
		
		ref=c1;
		c1.display();
		
		ref=e1;
		e1.display();

	}

}
