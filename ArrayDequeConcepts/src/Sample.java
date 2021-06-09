import java.util.ArrayDeque;

public class Sample {

	ArrayDeque<Integer> obj=new ArrayDeque<>();
	
	void get1()
	{
	obj.addFirst(2001);
	obj.add(1001);
	obj.add(1002);
	obj.add(1003);
	obj.addLast(3001);
	obj.removeFirst();
	
	System.out.println("Your data is::"+obj);
	
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();

	}

}
