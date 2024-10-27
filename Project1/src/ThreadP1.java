
public class ThreadP1 extends Thread
{
	public void run()
	{
		System.out.println("This is run method");
	}

	public static void main(String[] args) {
		
		ThreadP1 obj1=new ThreadP1();
		obj1.start();

	}

}
