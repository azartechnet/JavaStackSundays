import java.util.Scanner;

public class ArrayTwo {

	int empid[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array is::");
				empid[i][j]=sc.nextInt();
				System.out.println("Your value is::"+empid[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayTwo f1=new ArrayTwo();
		f1.get1();

	}

}