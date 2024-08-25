class B1
{
	int pid=1001;
	void get1()
	{
		System.out.println("Base class");
	}
}
class D1 extends B1
{
	String pname="apple";
	void get2()
	{
		System.out.println("Dervied class");
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("ProductId::"+pid+"ProductName::"+pname);
	}
}
public class MultilevelP1 {

	public static void main(String[] args) {
	
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
