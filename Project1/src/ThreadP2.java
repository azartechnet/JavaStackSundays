
public class ThreadP2 implements Runnable
{
    public void run()
    {
    	System.out.println("This is run method");
    }
	public static void main(String[] args) {
		
		ThreadP2 t1=new ThreadP2();
		Thread obj=new Thread(t1);
		obj.start();

	}

}
