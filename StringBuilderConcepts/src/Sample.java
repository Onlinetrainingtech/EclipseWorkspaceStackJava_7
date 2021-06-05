
public class Sample {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Welcome");
		
		System.out.println(sb.append("hai"));
		
		System.out.println(sb.insert(6,"****"));
		
		System.out.println(sb.delete(6, 10));
		
		System.out.println(sb.reverse());

	}

}
