
public class StringBuilderP1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("welcome");
		System.out.println(sb.append("hai"));
		System.out.println(sb.insert(5,"azar"));
		System.out.println(sb.replace(0, 5,"*****"));
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.reverse());

	}

}
