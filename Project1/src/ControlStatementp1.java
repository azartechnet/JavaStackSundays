import java.util.Scanner;

public class ControlStatementp1 {
	
	int pid;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the pid is::");
	   pid=sc.nextInt();
	   if(pid==1001)
	   {
		   System.out.println("Its is Equal");
	   }
	   else
	   {
		   System.out.println("Its is Not Equal");
	   }
	}
	void get2()
	{
		int bns;
		System.out.println("Enter the age is::");
		int age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			int sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	void get3()
	{
		int exp;
        
        System.out.println("Enter the exp value is::");
        exp=sc.nextInt();
        switch(exp)
        {
        case 1:
        	System.out.println("Case-1");
        	break;
        case 2:
        	System.out.println("Case-2");
        	break;
        case 3:
        	System.out.println("Case-3");
        	break;
        default:
        	System.out.println("default");
        
        }
	}

	public static void main(String[] args) {
	
		ControlStatementp1 f1=new ControlStatementp1();
		//f1.get1();
		//f1.get2();
		f1.get3();
	}

}
