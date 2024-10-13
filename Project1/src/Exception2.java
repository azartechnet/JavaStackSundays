import java.util.Scanner;

public class Exception2 
{
   void get1()
   {
	   try
	   {
	   String s1=null;
	   System.out.println("Length of the String::"+s1.length());
	   }
	   catch(NullPointerException t)
	   {
		   System.out.println(t);
	   }
   }
   void get2()
   {
	   try
	   {
		   try
		   {
			   int a[]=new int[2];
			   int i,n;
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter the n value is::");
			   n=sc.nextInt();
			   for(i=0;i<=n;i++)
			   {
				   System.out.println("Enter the array value is::");
				   a[i]=sc.nextInt();
				   System.out.println("Array value is::"+a[i]);
			   }
		   }
		   catch(ArrayIndexOutOfBoundsException t)
		   {
			   System.out.println(t);
		   }
	   }
	   catch(Exception r)
	   {
		   
	   }
	   finally
	   {
		   System.out.println("finally block");
	   }
   }
	public static void main(String[] args) {
		
		Exception2 f1=new Exception2();
		f1.get1();
		f1.get2();

	}

}
