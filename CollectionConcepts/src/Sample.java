import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Demo
{
	//HashSet<Integer>list1=new HashSet<>();
	//TreeSet<Integer>list1=new TreeSet<>();
	ArrayList<Integer>list1=new ArrayList<>();
	void get1()
	{
		list1.add(101);
		list1.add(102);
		list1.add(103);
		
		Iterator g1=list1.iterator();
		
		while(g1.hasNext())
		{
			System.out.println("WhileLoopData::"+g1.next());
		}
		System.out.println("SizeData::"+list1.size());
		System.out.println("Searching::"+list1.contains(101));
		System.out.println("RemoveData::"+list1.remove(102));
		System.out.println("AfterRemove::"+list1.contains(102));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
