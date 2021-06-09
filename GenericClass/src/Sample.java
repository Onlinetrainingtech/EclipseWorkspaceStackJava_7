class Demo<T>
{
	public T t;//int t;
	
	public void setValue(T t)
	{
		this.t=t;
	}
	public void get()
	{
		System.out.println("Integer/String::"+t);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo<Integer>h1=new Demo<Integer>();
		
		Demo<String>h2=new Demo<String>();
		
		h1.setValue(100);
		
		h2.setValue("azar");
		h1.get();
		h2.get();

	}

}
