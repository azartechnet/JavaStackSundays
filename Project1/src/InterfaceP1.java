interface Sample12
{
	void get1();
}
interface Sample13 extends Sample12
{
	void get2();
}
class D13 implements Sample13
{

	@Override
	public void get1() {
		
		System.out.println("This is interface body");
		
	}
	public void get2()
	{
		System.out.println("This is interface body");
	}
	
}
public class InterfaceP1 {

	public static void main(String[] args) {
		
		D13 f1=new D13();
		f1.get1();
		f1.get2();

	}

}
