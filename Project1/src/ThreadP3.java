
public class ThreadP3 extends Thread
{

	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("RUNIN");
			try {
				Thread.sleep(10000);
			System.out.println("I value is::"+i);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		
		ThreadP3  t1=new ThreadP3();
		t1.start();

	}

}
