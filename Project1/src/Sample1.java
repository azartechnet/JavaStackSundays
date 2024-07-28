
public class Sample1
{
	String pname="apple";//class or instance
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("Get1 function::"+pid);
	}
	void get2()
	{
		System.out.println("Get2 function::"+pname);
	}

	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.get1();
		f1.get2();

	}

}
