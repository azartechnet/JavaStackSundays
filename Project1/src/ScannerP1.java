import java.util.Scanner;

public class ScannerP1 
{
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
    void get1()
    {
    	System.out.println("Enter the empid::");
    	empid=sc.nextInt();
    	System.out.println("Enter the empname::");
    	empname=sc.next();
    }
    void display()
    {
    	System.out.println("Your empid is::"+empid+"Your empname is::"+empname);
    }
	public static void main(String[] args) {
		
		ScannerP1 f1=new ScannerP1();
		f1.get1();
		f1.display();

	}

}
