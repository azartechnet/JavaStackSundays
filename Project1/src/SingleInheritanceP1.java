class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("Base class");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Dervied class::"+pid);
	}
}
public class SingleInheritanceP1 {

	public static void main(String[] args) {
		

		D f1=new D();
		f1.get1();
		f1.get2();
	}

}
