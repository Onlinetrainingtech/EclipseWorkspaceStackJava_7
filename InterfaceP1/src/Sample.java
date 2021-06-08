interface Product
{
	int pid=1001;
	void addProduct();
	void viewProduct();
}
interface Category extends Product
{
	int cid=2001;
	void viewCategory();
	
}
class Demo implements Category
{
	public void addProduct()
	{
		System.out.println("This is addProduct");
	}
	public void viewProduct()
	{
		System.out.println("This is viewProduct"+pid);
	}
	public void viewCategory()
	{
		System.out.println("This is Category::"+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addProduct();
		f1.viewProduct();
        f1.viewCategory();
	}

}
