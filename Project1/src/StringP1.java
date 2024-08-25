
public class StringP1 {

	public static void main(String[] args) {
		
		String s1=new String("Helloworld");
		
		//System.out.println("Your data is::"+s1);
		
		//System.out.println(s1.length());
		
		String s2="welcome";
		
		/*if(s1.equals(s2))
		{
			System.out.println("LoginSuccess!!");
		}
		else
		{
			System.out.println("LoginFail!!!");
		}*/
		
		String s3="welcome";
		int res=s2.compareTo(s3);
		System.out.println("Compare::"+res);
		System.out.println(s1.equals(s2));

		System.out.println(s2.startsWith("w"));
		System.out.println(s2.endsWith("r"));
		System.out.println(s2.indexOf('w'));
		
	}

}
