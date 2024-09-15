abstract class Sample16
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is get2 function...");
	}
}
class D12 extends Sample16
{

	@Override
	void get1() {
		
		System.out.println("This is Abstract Method..");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
