
public class Sample {

	int productid=1001;//class or instance variable
	
	void addProduct()
	{
		String pname="apple";//local variable
		System.out.println("Your data in addProduct is::"+productid+""+pname);
	}
	void addCategory(int cid,String cname)
	{
		System.out.println("Your addCategory is::"+cid+""+cname);
	}
	
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.addProduct();
		d1.addCategory(2001,"mobile");

	}

}
