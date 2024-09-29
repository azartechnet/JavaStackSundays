import java.util.HashSet;
import java.util.TreeSet;

public class CollectionP1 {

//	HashSet<Integer>list1=new HashSet<Integer>();
	TreeSet<Integer>list1=new TreeSet<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1002);
		System.out.println("List of value is::"+list1);
		System.out.println("Total Size of list::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains(1001));
		System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After Removing of list::"+list1.size());
	}
	public static void main(String[] args) {
		
		CollectionP1 f1=new CollectionP1();
		f1.get1();

	}

}
