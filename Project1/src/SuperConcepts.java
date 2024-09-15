
class B5
{
	protected  int empid=1001;
	void get1()
	{
		System.out.println("Base class value is::"+empid);
	}
}
class D5 extends B5
{
	void get2()
	{
	   int empid=1002;
	   System.out.println("Dervied class value is::"+super.empid);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
		
		D5 f1=new D5();
		f1.get1();
		f1.get2();

	}

}