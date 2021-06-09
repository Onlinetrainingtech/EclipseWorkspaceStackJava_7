
public class Demo {

	public <M> M test(M t)
	{
		System.out.println("GenericMethod"+t);
		return t;
	}
	
	
	
	public static void main(String[] args) {
		
		Demo g1=new Demo();
		g1.test(100);
		g1.test("azar");
		g1.test(23.4);
		

	}

}
