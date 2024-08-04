import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 {

	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws NumberFormatException, IOException
	{
		System.out.println("Enter the empid is::");
		int empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
		
		System.out.println("Your value is::"+empid+""+empname);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		DataInputStreamP1 d1=new DataInputStreamP1();
		d1.get1();

	}

}
