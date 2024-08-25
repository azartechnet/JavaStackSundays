import java.util.Scanner;

public class ArrayOne {

	int empid[]=new int[10];
	int n,i;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the empid is::");
	   n=sc.nextInt();
	   for(i=0;i<=n;i++)
	   {
		   System.out.println("Enter the array value is::");
		   empid[i]=sc.nextInt();
		   System.out.println("Your Value is::"+empid[i]);
	   }
	}
	public static void main(String[] args) {
		
		ArrayOne f1=new ArrayOne();
		f1.get1();

	}

}
