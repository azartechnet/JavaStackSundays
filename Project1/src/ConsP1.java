class Samples
{
	Samples()
	{
		System.out.println("This is default const..");
	}
	Samples(int a)
	{
		System.out.println("Value is::"+a);
	}
	void get1()
	{
		System.out.println("Noraml function");
	}
}

public class ConsP1 {

	public static void main(String[] args) {
		
		Samples f1=new Samples();//default
		new Samples(100);//paracons
		f1.get1();

	}

}
