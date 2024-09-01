class Sample14
{
	void get1(int a,int b)
	{
		System.out.println("Your value is::"+a+""+b);
	}
	void get1(float f,String name)
	{
		System.out.println("Your value is::"+f+""+name);
	}
}
public class MethodOverloadingP1 {

	public static void main(String[] args) {
		
		Sample14 f1=new Sample14();
		f1.get1(100,200);
		f1.get1(2.5f,"mohamed");

	}

}
