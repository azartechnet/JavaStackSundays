import java.util.ArrayList;
import java.util.Iterator;

public class CollectionP2 {
    ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1002);
		Iterator g1=list1.iterator();
		while(g1.hasNext())
		{
			System.out.println("Your Inside data is::"+g1.next());
		}
		System.out.println("List of value is::"+list1);
		System.out.println("Total Size of list::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains(1001));
		//System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After Removing of list::"+list1.size());
	}
	public static void main(String[] args) {
		
		CollectionP2 f1=new CollectionP2();
		f1.get1();

	}

}
