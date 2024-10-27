
public class ThreadP4 extends Thread
{

	public void run()
	{
		System.out.println("CurrentThread Name is::"+getName());
		System.out.println("CurrentThreadPriority::"+getPriority());
	}
	public static void main(String[] args) {
		
		ThreadP4 obj1=new ThreadP4();
		obj1.start();
		obj1.setPriority(MAX_PRIORITY);
		obj1.setName("SDLC");

	}

}
