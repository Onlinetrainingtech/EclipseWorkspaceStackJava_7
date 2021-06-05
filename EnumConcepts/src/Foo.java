
public class Foo {

	enum empage{mohamed(31),azar(32),raja(34);
		
		private int value;
		
		empage(int e1)
		{
			value=e1;
		}
		int get()
		{
			return value;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		empage f1=empage.mohamed;
		System.out.println("Value is::"+f1.get());

	}

}
