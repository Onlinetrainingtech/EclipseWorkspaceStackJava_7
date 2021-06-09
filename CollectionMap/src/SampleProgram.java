import java.util.HashMap;
import java.util.Map;

class Demo
{
	
	Map<Integer,String>j1=new HashMap<>();
	void get1()
	{
		j1.put(101,"s1");
		j1.put(102,"s2");
		j1.put(104,"s2");
		j1.put(105,"s3");
	}
	void get2()
	{
		for(Map.Entry k:j1.entrySet())
		{
			System.out.println("Display of::"+k.getKey()+""+k.getValue());
		}
		
		System.out.println("Searching of:"+j1.containsKey(101));
		System.out.println("Remove of:"+j1.remove(102));
		System.out.println("Check of:"+j1.containsKey(102));
		System.out.println("Size of::"+j1.size());
		System.out.println("Index of::"+j1.get(104));
		System.out.println(j1);
	}
	
}


public class SampleProgram {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
