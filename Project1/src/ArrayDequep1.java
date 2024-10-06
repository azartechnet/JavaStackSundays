import java.util.ArrayDeque;

public class ArrayDequep1 {

	ArrayDeque<Integer>list1=new ArrayDeque<Integer>();
	void get1()
	{
		list1.addFirst(1001);
		list1.add(1002);
		list1.add(1003);
		list1.addLast(1004);
		
		System.out.println("your data is::"+list1);
		System.out.println("Total size is::"+list1.size());
		System.out.println("Searching is::"+list1.contains(1001));
		System.out.println("Remove first::"+list1.removeFirst());
	}
	public static void main(String[] args) {
		
		ArrayDequep1 f1=new ArrayDequep1();
		f1.get1();

	}

}
